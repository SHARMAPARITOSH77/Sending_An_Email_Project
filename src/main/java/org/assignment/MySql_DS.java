package org.assignment;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MySql_DS implements DataSource{

    public void sendEmail() {
        List<String> list = new ArrayList();
        list.add("jack77@gamil.com");
        list.add("roman99@gamil.com");
        list.add("dhoni@88gmail.com");
        list.add("rohit@55gamil.com");
        list.add("brock@5142gmail.com");
        System.out.println("Email : " + list );

    }
}
