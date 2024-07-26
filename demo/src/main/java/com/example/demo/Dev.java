package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    /* WITH AUTOWIRE
    @Autowired //called as field injection
    private  Laptop laptop;
    public void greet(){
        laptop.compile();
        System.out.println("With Autowire");
    }*/

    /*WITH CONSTRUCTOR
    private  Laptop laptop;

    public Hello(Laptop laptop){
        this.laptop=laptop;
    }

    public void greet(){
        laptop.compile();
        System.out.println("With Constructor");
    }*/

//    WITH SETTER
    @Autowired
    private Laptop laptop;
    public void setLaptop(Laptop laptop){
        this.laptop=laptop;
    }

    public void greet(){
        laptop.compile();
        System.out.println("With setter Function");
    }


}
