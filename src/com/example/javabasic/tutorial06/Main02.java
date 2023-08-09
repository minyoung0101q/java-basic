package com.example.javabasic.tutorial06;

public class Main02 {
    public static void main(String[] args) {
        String a = "Man";
        int b = 0;

        //자바는 String을 비교할 때 equal()을 이용합니다.
        //그 이유는 String을 다른 자료형과 다른 문자열 자료형이기 때문.
        if (a.equals("Man")) { //a가 Man이라는 문자열과 같은지 비교
            System.out.println("남자입니다.");
        }
        else {
            System.out.println("남자가 아닙니다.");
        }

        if(b==3) {
            System.out.println("b는 3입니다.");
        }
        else {
            System.out.println("3이 아닙니다.");
        }

        if(a.equalsIgnoreCase("man") && b == 0) { //equalsIgnoreCase : 대소문자 구분 없이 문자 자체가 같은지 검증
            System.out.println("참입니다.");
        }
        else {
            System.out.println("거짓입니다.");
        }
    }
}
