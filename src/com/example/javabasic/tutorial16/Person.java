package com.example.javabasic.tutorial16;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    //각각의 변수에 접근할 수 있는 메서드를 한 번에 만들 수 있음
    //Alt + insert + Getter and Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Alt + insert + constructor(생성자)
    public Person(String name, int age, int height, int weight) {
        super(); //자신의 부모 클래스의 생성자를 실행
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}
