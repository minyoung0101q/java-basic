package com.example.javabasic.tutorial05;

public class Main02 {
    public static void main(String[] args) {
        String a = "I Love You."; //String은 자바에서는 비원시적 자로형으로써 클래스형을 기반으로 만들어짐 -> 그래서 내부적인 함수를 가질 수 있음.
        if(a.contains("Love")) { //contains 함수는 자바가 제공하는 하나의 함수.
            System.out.println("Me too.");
        } else {
            System.out.println("I Hate You.");
        }
    }
}
/* 조건문과 반복문(논리의 흐름의 기본)
* 조건문과 반복문을 제대로 학습해야 프로그래밍을 잘할 수 있음
* if문을 이용하여 문자열이 특정 문자열을 포함하는지 확인하는 프로그램을 작성
* */