package com.example.javabasic.tutorial06;

public class Main08 {
    final static int N = 30;
    public static void main(String[] args) {
        //for문: 초기화 부분, 조건 부분, 연산 부분
        for(int i = N; i > 0; i--) {
            for(int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//이중 for문 == 중첩된 반복문
//for문으로 삼각형 출력