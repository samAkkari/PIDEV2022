package tn.esprit.pidev.controllers;

import tn.esprit.pidev.config.MyConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleEmailExampleController {

    @Autowired
    public JavaMailSender emailSender;

    @ResponseBody
    @RequestMapping("/sendSimpleEmail/{email}")
    public String sendSimpleEmail(@PathVariable("email") String email) {
    	
        // Create a Simple MailMessage.
        SimpleMailMessage message = new SimpleMailMessage();
        
        message.setTo(email);
        message.setSubject("Test Simple Email");
        message.setText("http://localhost:4200/liste-invitations");

        // Send Message!
        this.emailSender.send(message);

        return "Email Sent!";
    }

}