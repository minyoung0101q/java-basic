package com.example.javabasic.tutorial02;

public class Main {
    final static int INT_MAX = 2147483647;
    public static void main(String[] args) {
        int a = INT_MAX;
        System.out.println(a + 1); // -2147483648 출력(int형이 가질 수 있는 최저값 출력)
        //오버플로 현상 발생 int 형 최대값에서 1을 더하니 가장 작은 값이 출력(순환구조)
    }
}

//<변수>
//변수와 상수를 사용해 프로그램 구현
//가장 많이 쓰이는 int, double, String 타입의 데이터를 선언 및 출력
//final 키워드를 통해 상수 정의 -> main 함수 밖에서 사용
//오버플로의 개념 이해
//사칙연산 프로그램 작성