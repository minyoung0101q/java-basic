package com.example.javabasic.tutorial04;

public class Main05 {
    //반환형, 함수 이름, 매개 변수
    static int max(int a, int b) { //static을 붙여주면 정상적으로 작동
        int result = (a > b) ? a: b;
        return result;
    }
    public static void main(String[] args) { //static은 클래스 전반적으로 사용되는 함수
        int x = 60;
        int y = 50;
        System.out.println(max(x, y)); //클래스 레벨에서 max 메서드 호출 가능
    }
}
//연산자
//삼항연산자
//함수
//max 함수를 정적(static)으로 선언함