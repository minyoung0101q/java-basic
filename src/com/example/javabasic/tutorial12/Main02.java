package com.example.javabasic.tutorial12;

public class Main02 {
    public static int fibonacci(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // 피보나치 수열의 몇 번째 원소를 계산할지 지정
        System.out.println("피보나치 수열의 " + n + "번째 원소는 " + fibonacci(n) + "입니다.");
    }
}

/*
 * 피보나치 수열을 재귀 함수로 구현
 *  */