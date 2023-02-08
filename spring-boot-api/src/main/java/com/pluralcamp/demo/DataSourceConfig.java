package com.pluralcamp.demo;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

//@Configuration
public class DataSourceConfig {

	@Bean
	public DataSource getDataSource() {
		return DataSourceBuilder.create()
				.driverClassName("com.mysql.cj.jdbc.Driver")
				.url("jdbc:mysql://localhost:3306/spring_data1?serverTimeZone=Europe/Paris")
				.username("skyrosa")
				.password("pluralcamp")
				.build();
	}
}
