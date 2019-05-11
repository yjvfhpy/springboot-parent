package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * https://www.cnblogs.com/scode2/p/8671223.html
 *
*/

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class ConfigConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigConfigApplication.class, args);
	}
}
