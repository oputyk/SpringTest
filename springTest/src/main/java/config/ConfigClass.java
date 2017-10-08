package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
	@Bean
	String getString() {
		return "Spring Hello World!";
	}
}
