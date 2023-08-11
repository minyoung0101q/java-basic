package com.example.javabasic.tutorial13;

public class Main02 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        int sum = 0;
        for(int i = 0; i < 100; i++) {
            sum += array[i];
        }
        System.out.println("100개의 랜덤 정수의 평균 값은 " + sum / 100 + "입니다.");
    }
}
//모든 값들에 1 ~ 100까지의 숫자 중 랜덤한 숫자가 들어감
/* 배열
* 100개의 랜덤 정수의 평균을 구하는 프로그램을 작성 */
//각종 통계를 할 때 random 이라는 것을 많이 사용한다.