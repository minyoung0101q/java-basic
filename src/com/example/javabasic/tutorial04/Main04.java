package com.example.javabasic.tutorial04;

public class Main04 {
    public static void main(String[] args) {
        int a = 50;
        int b = 50;
        System.out.println("a와b가 같은가요? " + (a == b));
        System.out.println("a가b보다 큰가요? " + (a > b));
        System.out.println("a가b보다 작은가요? " + (a < b));
        System.out.println("a가 b와 같으면서 a가 30보다 큰가요? " + ((a == b) && (a > b))); //&& : 두 조건 모두 만족
        System.out.println("a가 50이 아닌가요?" + !(a == 50)); //not 연산자 활용
        System.out.println("a가 b와 같거나 a가 30보다 큰가요? " + ((a == b) || (a > b))); //&& : 두 조건 중 하나만 만족해도 ok
    }
}
//연산자
// ==, >, <, &&, ||, ! 연산의 개념을 바르게 이해하고 프로그램 작성
