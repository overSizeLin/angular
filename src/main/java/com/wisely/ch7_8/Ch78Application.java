package com.wisely.ch7_8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class Ch78Application {
    @RequestMapping(value ="/search",produces ={MediaType.APPLICATION_JSON_VALUE})
    public Person search(String personName){
        return new Person(personName,"hefei",32);
    }
    public static void main(String[] args) {
        SpringApplication.run(Ch78Application.class, args);
    }
}
