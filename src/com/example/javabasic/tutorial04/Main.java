package com.example.javabasic.tutorial04;

public class Main {
    final static int SECOND = 1000;

    public static void main(String[] args) {
        int minute = SECOND / 60;
        int second = SECOND % 60;
        System.out.println(minute + "분" + second + "초"); //16분 40초 (1000초)
    }
}
//<연산자>
//초를 입력 받아 몇 분 몇 초인지 계산하는 프로그램 작성