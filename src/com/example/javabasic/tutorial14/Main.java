package com.example.javabasic.tutorial14;

public class Main { //이중 for문
    public static void main(String[] args) {
        int N = 50; //행과 열의 길이
        int[][] array = new int[N][N]; //50행 50열의 이차원 배열
        for(int i = 0; i < N; i++) { //행 처리
            for(int j = 0; j < N; j++) { //열 처리
                array[i][j] = (int)(Math.random() * 10); //0~9 랜덤한 정수로 배열의 요소가 채워짐
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
/* 다차원 배열 : 배열이 배열의 원소로 들어가는 구조를 말합니다. 흔히 이차원 배열은 M X N 형태의 지도를 나타내고자 할 때 많이 사용됩니다.
* 이러한 다차원 배열을 적절하게 활용하게 되면 현실 세계의 다양한 문제를 보다 쉽게 접근할 수 있습니다.
* - 10 X 10의 정수 랜덤 데이터를 생성하여 전체 데이터를 분석합니다.
* */
