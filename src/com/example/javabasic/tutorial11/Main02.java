package com.example.javabasic.tutorial11;

public class Main02 {
    //5! = 4 * 4 * 3 * 2 * 1
    public static int factorial(int number) {
        int sum = 1;
        for(int i = 2; i <= number; i++) {
            sum *= i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("10팩토리얼은 " + factorial(10));
    }
}
/* 반복함수로 팩토리얼 구현 */