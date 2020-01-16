package dev.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Le stéréotype @Configuration précise que cette classe servira de configuration.
@Configuration
@ComponentScan("dev")
public class AppConfig {
	@Bean
	public java.util.Scanner Scanner() {
		return new java.util.Scanner(  System.in);
	}
}