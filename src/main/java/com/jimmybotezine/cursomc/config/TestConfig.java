package com.jimmybotezine.cursomc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jimmybotezine.cursomc.services.EmailService;
import com.jimmybotezine.cursomc.services.SmtpEmailService;

@Configuration
@Profile("test")
public class TestConfig {
	
	/*
	 * @Bean public EmailService emailService() { return new MockEmailService(); }
	 */
	
	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}
}