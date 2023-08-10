package com.example.javabasic.tutorial11;

public class Main03 {
    public static int factorial(int number) {
        if(number == 1) {
            return 1;
        }
        else
            return number * factorial(number - 1);
        // 10! = 10 * 9!
    }
    public static void main(String[] args)
    {
        System.out.println("10 팩토리얼은 " + factorial(10));
    }
}
/* 재귀함수로 팩토리얼 구현 */