package org.example.item01;

/**
 * 영문 인사말
 */
public class EnglishHelloService implements HelloService{
    @Override
    public String hello() {
        return "Hello";
    }
}
