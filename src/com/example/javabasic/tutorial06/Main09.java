package com.example.javabasic.tutorial06;

public class Main09 {
    final static int N = 15;
    public static void main(String[] args) {
        for(int i = -N; i <= N; i++) {
            for(int j = -N; j <= N; j++) {
                if(i * i + j * j <= N * N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/* for문 활용하여 원 출력 */
// 수학적 연산이 들어감
// 원의 방정식 => x^2 + y^2 = r^2 (x의 제곱 + y의 제곱 = r의 제곱, 원점을 중심으로 하는 원의 방정식)
// 도형을 만드는 것으로 반복문 연습을 많이 함