package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    /*
    WITH CONSTRUCTOR
    private  Laptop laptop;

    public Hello(Laptop laptop){
        this.laptop=laptop;
    }

    public void greet(){
        laptop.compile();
        System.out.println("With Constructor");
    }*/

/*//    WITH SETTER
    @Autowired
    private Laptop laptop;
    public void setLaptop(Laptop laptop){
        this.laptop=laptop;
    }

    public void greet(){
        laptop.compile();
        System.out.println("With setter Function");
    }*/

    //WITH Autowire, Qualifier and Primary
    @Autowired
    @Qualifier("desktop")//give the class name in lower cases that u wanna make primary or write @Primary in the file
    private Computer computer;
    public void build(){
        computer.compile();
        System.out.println("Calling through Interfaces");
    }

}
