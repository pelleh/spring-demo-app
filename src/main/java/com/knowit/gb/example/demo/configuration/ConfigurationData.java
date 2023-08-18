package com.knowit.gb.example.demo.configuration;

//@ConfigurationProperties(prefix="demo-datasource-properties")
public class ConfigurationData {

	private String jdbc;
	private String password;
	private String username;

	public String getJdbc() {
		return jdbc;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}
}
