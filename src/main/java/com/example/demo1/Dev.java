package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev{

    //Laptop laptop=new Laptop();
//    @Autowired //FIELD INJECTION
//    private Laptop laptop;



    @Autowired
    @Qualifier("laptop") //without capital letter
    private Computer computer;

    public void build(){

    computer.compile();
    System.out.println("Building Dev page ");
}


}