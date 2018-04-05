package com.example.reverse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@SpringBootApplication
public class ReverseApplication {

		@Bean
		Function<Flux<String>, Flux<String>> reverse() {
				return stringFlux -> stringFlux.map(ReverseApplication::reverse);
		}

		private static String reverse(String in) {
				char[] input = in.toCharArray();
				char[] output = new char[input.length];
				for (int i = 0; i < input.length; i++) {
						output[i] = input[input.length - 1 - i];
				}
				return new String(output);
		}

		public static void main(String[] args) {
				SpringApplication.run(ReverseApplication.class, args);
		}
}
