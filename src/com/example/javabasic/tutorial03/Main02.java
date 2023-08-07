package com.example.javabasic.tutorial03;

public class Main02 {

    public static void main(String[] args) {
        int a = 200;
        System.out.println("10진수: " + a); //10진수 출력
        System.out.format("8진수: %o\n", a); //format은 줄바꿈 안 됨, %o(형식지정자로 10진수 정수를 8진수로 출력)자리에 a가 들어감
        System.out.format("16진수: %x", a); //16진수 출력
    }
}
//<자료형>
//10진수를 8진수, 16진수로 변환
