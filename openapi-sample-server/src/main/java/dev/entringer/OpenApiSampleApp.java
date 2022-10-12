package dev.entringer;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "OpenAPI - Sample Project",
								description = "This service aims to provide information regarding Orders...",
								version = "1.0",
								contact = @Contact(name = "Fabricio Entringer", email = "moreira@gmal.com")),
					servers = {@Server(url = "http://localhost:8080"), @Server(url = "https://openapi-sample.org")},
					externalDocs = @ExternalDocumentation(description = "User Requirements", url = "https://openapi-sample.org/docs"))
public class OpenApiSampleApp {

	public static void main(String[] args) {
		SpringApplication.run(OpenApiSampleApp.class, args);
	}

}
