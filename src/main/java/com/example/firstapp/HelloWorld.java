package com.example.firstapp;
import javax.ejb.Local;

@Local
public interface HelloWorld {
    public String hello();
}
