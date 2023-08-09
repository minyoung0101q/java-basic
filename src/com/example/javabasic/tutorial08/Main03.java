package com.example.javabasic.tutorial08;

public class Main03 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            for(int j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
// 삼각형 출력 *