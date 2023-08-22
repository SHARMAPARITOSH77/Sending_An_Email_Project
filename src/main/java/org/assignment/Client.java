package org.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);
        EmailService emailService = applicationContext.getBean(EmailService.class);
        emailService.sendEmail();

    }


}

