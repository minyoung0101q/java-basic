package com.example.javabasic.tutorial04;

public class Main02 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("현재의 a는 " + a + "입니다.");
        a++; //증감연산자로, a에 1을 더해줌
        System.out.println("현재의 a는 " + a + "입니다.");
        System.out.println("현재의 a는 " + ++a + "입니다."); //a에 1을 더한 다음 출력
        System.out.println("현재의 a는 " + a++ + "입니다."); //현재 a값을 출력한 후 다음 식(밑의 식)을 1 증가시킴
        System.out.println("현재의 a는 " + a + "입니다."); //a가 1 증가해서 13이 출력됨
    }
}
//연산자
//증감연산자 ++ --
