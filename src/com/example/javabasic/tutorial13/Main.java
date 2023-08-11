package com.example.javabasic.tutorial13;

import java.util.Scanner;

public class Main {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("생성할 배열의 크기를 입력하세요 : ");
        int number = sc.nextInt();
        int[] array = new int[number]; //5크기의 배열 생성
        for(int i = 0; i < number; i++) {
            System.out.print("배열에 입력할 정수를 하나씩 입력하세요 : ");
            array[i] = sc.nextInt();
        }
        int result = -1;
        for(int i = 0; i < number; i++) {
            result = max(result, array[i]);
        }
        System.out.println("입력한 모든 정수 중에서 가장 큰 값은 : " + result + "입니다.");
    }
}
/* 배열: 데이터가 많을 때 사용
* 배열을 만들 때 사용하는 하나의 문법: int[] array = new int[100];
* - 원하는 개수만큼의 배열 생성 및 최대값을 구하는 프로그램 작성
*  */