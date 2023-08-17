package com.knowit.gb.example.demo.dao;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BackendDao {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource getDatasource() {
		return DataSourceBuilder.create().build();
	}
}
