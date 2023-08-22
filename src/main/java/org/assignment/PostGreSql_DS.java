package org.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@Primary
public class PostGreSql_DS implements DataSource {

    public void sendEmail() {
        List <String> list = new ArrayList();
        list.add("sharmaparitosh77@gamil.com");
        list.add("mohitsaini99@gamil.com");
        list.add("anshulverma@88gmail.com");
        list.add("abhishekhverma@55gamil.com");
        list.add("harrypotter@5142gmail.com");
        System.out.println("Email : " + list );
    }


}