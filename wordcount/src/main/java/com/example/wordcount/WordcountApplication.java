package com.example.wordcount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@SpringBootApplication
public class WordcountApplication {

		private static class Wordcount
			implements Function<Flux<String>, Flux<Map<String, Integer>>> {

				@Override
				public Flux<Map<String, Integer>> apply(Flux<String> words) {
						return words.window(Duration.ofSeconds(10))
							.flatMap(w -> w.collect(HashMap::new, (map, word) ->
								map.merge(word, 1, Integer::sum)));
				}
		}

		@Bean
		Function<Flux<String>, Flux<Map<String, Integer>>> wordcount() {
				return new Wordcount();
		}

		public static void main(String[] args) {
				SpringApplication.run(WordcountApplication.class, args);
		}
}
