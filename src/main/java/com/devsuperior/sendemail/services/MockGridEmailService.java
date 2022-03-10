package com.devsuperior.sendemail.services;

import com.devsuperior.sendemail.dto.EmailDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockGridEmailService implements EmailService {

    private static Logger LOG = LoggerFactory.getLogger(MockGridEmailService.class);

    public void sendEmail(EmailDTO dto) {

        LOG.info("Sending email to: " + dto.getTo());
        LOG.error("Email sent!");

    }
}