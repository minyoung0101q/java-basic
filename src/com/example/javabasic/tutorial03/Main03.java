package com.example.javabasic.tutorial03;

public class Main03 {

    public static void main(String[] args) {
        String name = "Min Young";
        System.out.println(name);//Min Young 출력
        System.out.println(name.substring(0, 1));//String 자료형 안에 substring이라는 내부적인 함수를 담고 있음
        System.out.println(name.substring(3, 6)); //3 ~ 5까지 출력
        System.out.println(name.substring(5, 8)); //5 ~ 7까지 출력
    }
}
//<자료형>
//String의 substring 함수 활용
//String은 내부적으로 class를 활용해 구성되어 있음