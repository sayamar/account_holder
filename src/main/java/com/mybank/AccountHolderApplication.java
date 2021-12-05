package com.mybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@SpringBootApplication
@EnableSwagger2
public class AccountHolderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountHolderApplication.class, args);
	}

	@Bean
	public Docket ambPayments() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.paths(PathSelectors.any())
				.build().apiInfo(new ApiInfo(null, null, null, null,
						new Contact("Maruthi Sayampu", "https://github.com/sayamar", "maruthi.sayampu@gmail.com"), null, null));
	}

}
