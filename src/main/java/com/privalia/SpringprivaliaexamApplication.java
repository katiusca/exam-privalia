package com.privalia;

import com.privalia.service.HttpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringprivaliaexamApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringprivaliaexamApplication.class);

	@Autowired
	HttpService httpService;

	public static void main(String[] args) {
		SpringApplication.run(SpringprivaliaexamApplication.class, args);
		LOGGER.info("Info Main Method called ");

	}

	@Override
	public void run(String... args) throws Exception {
		httpService.getClients();
		httpService.getPolicies();
	}
}
