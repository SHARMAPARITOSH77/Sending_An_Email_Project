package org.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
private DataSource dataSource;
    @Autowired
    public EmailService(DataSource dataSource){
    this.dataSource = dataSource;
        System.out.println("Initialized DataSource");
    }

    public void sendEmail() {
        dataSource.sendEmail();
    }



}
