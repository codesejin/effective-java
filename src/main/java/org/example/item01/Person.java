package org.example.item01;

/**
 * 이름, 성, 나이 속성을 가진 Person 클래스
 *
 * 생성자와 static factory를 구분하기 위한 API DOCS 확인용
 */
public class Person {
    private String lastName;
    private String firstName;
    private int age;

    // 생성자
    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public Person(int age, String lastName) {
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
    }

    // 정적 팩터리 메소드 1
    public static Person createWithLastName(String lastName) {
        Person person = new Person();
        person.lastName = lastName;
        return person;
    }

    // 정적 팩터리 메소드 2
    public static Person createWithFirstName(String firstName) {
        Person person = new Person();
        person.firstName = firstName;
        return person;
    }
}
