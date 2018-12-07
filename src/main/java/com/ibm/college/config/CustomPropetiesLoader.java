package com.ibm.college.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix="college.branch.ece")
@PropertySource("classpath:custom.properties")
@Getter
@Setter
public class CustomPropetiesLoader {

	private String principal;
	private String hod;
}
