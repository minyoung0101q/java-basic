package com.example.javabasic.tutorial09;

public class Main03 {
    // 반환형, 함수명, 매개변수
    public static int function(int a, int b, int c) { //매개변수 3개, 반환형은 int
        int min;
        if(a > b) {
            if(b > c) {
                min = c;
            }
            else {
                min = b;
            }
        }
        else {
            if(a > c) {
                min = c;
            }
            else {
                min = a;
            }
        }
        for(int i = min; i > 0; i--) {
            if(a % i == 0 && b % i == 0 && c % i == 0) {
                return i; //현재의 i값을 반환하면서 함수를 종료시킴
            }
        }
        return -1; //최대공약수가 없는 경우에는 -1을 반환하면서 최대공약수가 없다는 것을 밝힘
    }
    public static void main(String[] args) {
        System.out.println("(20, 30, 5)의 최대 공약수 : " + function(20, 30, 5));
    }
}
/* 사용자 정의 함수
* - 3개의 수 최대 공약수를 찾는 프로그램을 작성합니다.
* 자바에서는 메서드와 함수가 같은 의미.
* */