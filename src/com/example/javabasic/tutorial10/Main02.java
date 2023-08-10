package com.example.javabasic.tutorial10;

public class Main02 {
    public static char function(String input) {
        return input.charAt(input.length() - 1); //charAt : 몇 번째 문자를 하나 뽑아오는 함수 길이에서 1을 빼면 특정한 문자열의 가장 마지막 문자를 얻을 수 있음
    }
    public static void main(String[] args) {
        System.out.println("Hello World의 마지막 단어는" + function("Hello World"));
    }
}
/* 문자열에서 마지막 단어를 반환하는 함수 작성 */