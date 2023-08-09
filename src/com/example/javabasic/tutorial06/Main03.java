package com.example.javabasic.tutorial06;

public class Main03 {
    public static void main(String[] args) {
        int i = 1, sum = 0; //한번에 두개의 변수 선언, 초기화
        while(i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
/* 조건문 & 반복문
* while을 이용하여 1부터 100까지의 합을 출력하는 프로그램 구현
* */