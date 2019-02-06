package com.jair.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.jair.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido pedido);
	
	void sendEmail(SimpleMailMessage msg);
	
}
