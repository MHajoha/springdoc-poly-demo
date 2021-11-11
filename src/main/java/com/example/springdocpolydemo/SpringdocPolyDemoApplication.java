package com.example.springdocpolydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdocPolyDemoApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SpringdocPolyDemoApplication.class, args);
	}

	// Replacing the PolymorphicModelConverter with one doing nothing does the trick
	/*
	@Bean
	public PolymorphicModelConverter noopPolymorphicModelConverter() {
		return new PolymorphicModelConverter() {

			@Nullable
			@Override
			public Schema<?> resolve(
					final AnnotatedType type,
					final ModelConverterContext context,
					final Iterator<ModelConverter> chain
			) {
				if (chain.hasNext()) {
					return chain.next().resolve(type, context, chain);
				} else {
					return null;
				}
			}
		};
	}
	*/
}
