package com.ibm.college.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix="coll")
@Getter
@Setter
public class CollegeProperties {

	private String name;
	private String address;
}
