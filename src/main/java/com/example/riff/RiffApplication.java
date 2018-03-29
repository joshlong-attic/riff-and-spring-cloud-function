package com.example.riff;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@SpringBootApplication
public class RiffApplication {

		@Bean
		Function<Flux<Foo>, Flux<Bar>> lowercase() {
				return incoming -> incoming.log().map(value -> new Bar(value.lowercase()));
		}

		public static void main(String[] args) {
				SpringApplication.run(RiffApplication.class, args);
		}
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Foo {
		private String value;

		String lowercase() {
				return value.toLowerCase();
		}
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Bar {
		private String value;
}
