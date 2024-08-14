package com.example.demo1;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void compile(){

        System.out.println("desktop compile");
    }

}
