package com.example.javabasic.tutorial07;

import java.util.Scanner; //Scanner 임포트

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner 클래스 활용, System.in : 콘솔창에서 사용자가 입력하는 것을 의미
        System.out.println("정수를 입력하세요 : ");
        int i = sc.nextInt(); //사용자가 입력한 정수를 i 변수에 넣어줌
        System.out.println("입력한 정수는" + i + "입니다.");
        sc.close(); //정상적으로 입출력하는 변수가 완전히 닫힘

    }
}
/* 특정한 정수를 입력받아서 그대로 출력하는 시스템 구현 */
//Scanner: 자바에서 제공해주는 입출력을 가능하게 해주는 기본 라이브러리