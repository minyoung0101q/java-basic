package com.example.javabasic.tutorial06;

public class Main04 {
    public static void main(String[] args) {
        int i = 1, sum = 0; //지역변수, main 메서드 내에서 선언되었기 때문
        while(i <= 1000) { //i가 1000이하일 때 한에서
            sum += i++; //명령이 끝남과 동시에 i에는 1이 더해짐
        }
        System.out.println("1부터 1000까지의 합은" + sum + "입니다.");
    }
}
