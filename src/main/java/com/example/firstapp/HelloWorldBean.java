package com.example.firstapp;
import javax.ejb.Stateless;

@Stateless
public class HelloWorldBean implements HelloWorld{
    @Override
    public String hello() {
        return "Hello World! From a Session Bean ";
    }
}
