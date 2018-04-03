		package com.example.hellofunction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@SpringBootApplication
public class HelloFunctionApplication {

		@Bean
		Function<Flux<Input>, Flux<Output>> uppercase() {
				return inputFlux -> inputFlux.map(x -> new Output(x.getValue().toUpperCase()));
		}

		public static void main(String[] args) {
				SpringApplication.run(HelloFunctionApplication.class, args);
		}
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class Output {
		private String value;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Input {
		private String value;
}
