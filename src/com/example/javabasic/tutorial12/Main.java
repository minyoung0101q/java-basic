package com.example.javabasic.tutorial12;

public class Main {
    public static int fibonacci(int number) {
        int one = 1;
        int two = 1;
        int result = -1; //문제가 발생했을 때의 반환값
        if(number == 1) {
            return one;
        } else if(number == 2) {
            return two;
        }
        else {
            for(int i = 2; i < number; i++) {
                result = one + two;
                one = two;
                two = result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("피보나치 수열의 5번째 인덱스는 " + fibonacci(5) + "입니다.");
    }
}
/*
* 피보나치 수열을 반복 함수로 구현
* 피보나치 수열: 이전 값을 더해가며 진행
*  */