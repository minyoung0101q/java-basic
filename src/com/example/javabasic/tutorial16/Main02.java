package com.example.javabasic.tutorial16;

public class Main02 {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 20, 175, 70, "20170101", 1, 4.5);
        Student student2 = new Student("이순신", 30, 170, 80, "20090505", 4, 3.0);
        student1.show();
        student2.show();
    }
}
