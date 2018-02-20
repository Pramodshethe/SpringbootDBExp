package com.pramod.shethe.SpringbootJDBC;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {
    @Autowired
    JdbcTemplate jdbc;
    @RequestMapping("/insert")
    public String index(){
        jdbc.execute("insert into student(id,username,password,email,country)values(1,'Pramod','12345','abc@gmail.com','India')");
        return "data inserted successfully";
    }


}
