package dev.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// Le stéréotype @Configuration précise que cette classe servira de configuration.
@Configuration
@ComponentScan("dev")
public class AppConfig {
	@Bean
	public java.util.Scanner Scanner() {
		return new java.util.Scanner(System.in);
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		
		// TODO mettre à jour les informations de connexion à la base de données
		dataSource.setUrl("jdbc:mysql://localhost:3306/restaurant-bdd?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
	}
	
	
}