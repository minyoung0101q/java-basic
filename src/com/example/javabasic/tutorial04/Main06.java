package com.example.javabasic.tutorial04;

public class Main06 {
    //반환형, 함수 이름, 매개 변수
    int max(int a, int b) { //max 함수를 인스턴스 메서드로 정의
        int result = (a > b) ? a: b;
        return result;
    }
    public static void main(String[] args) { //static은 클래스 전반적으로 사용되는 함수
        Main06 m6 = new Main06(); //객체를 생성해서 max 함수 호출
        int p = m6.max(60, 50);
        System.out.println(p);
    }
}
//연산자
//삼항연산자
//함수
//max 함수를 인스턴스 메서드로 정의
