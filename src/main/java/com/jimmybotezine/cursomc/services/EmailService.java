package com.jimmybotezine.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.jimmybotezine.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
