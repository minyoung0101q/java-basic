package com.example.javabasic.tutorial06;

public class Main07 {
    final int N = 30;
    public static void main(String[] args) {
        //for문: 초기화 부분, 조건 부분, 연산 부분
        Main07 m7 = new Main07();
        for(int i = m7.N; i > 0; i--) {
            System.out.println("*");
        }
    }
}
/* for문을 이용하여 별 30개 출력 */