package org.example.item01;

/**
 * 한국 인사말
 */
public class KoreanHelloService implements  HelloService{
    @Override
    public String hello() {
        return "안녕하세요";
    }
}
