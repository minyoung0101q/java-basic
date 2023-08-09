package com.example.javabasic.tutorial06;

public class Main05 {
    static int globalVar = 10; //전역변수 선언

    public static void main(String[] args) {
        int i = 1, sum = 0; //main 메서드 내에서 지역 변수 i와 sum 선언
        while(i <= 1000) {
            sum += i++;
        }
        System.out.println("1부터 1000까지의 합은" + sum + "입니다.");

        // anotherMethod 호출, i와 sum을 인자로 전달
        anotherMethod(i, sum);
    }

    public static void anotherMethod(int i, int sum) { //매개변수 i와 sum 선언
        System.out.println("anotherMethod 내에서 i 변수 값: " + i);
        System.out.println("anotherMethod 내에서 sum 변수 값: " + sum);
        System.out.println("전역 변수 값: " + globalVar);
    }
}

/* 전역변수와 지역변수 */
//anotheerMethod 내에서 i와 sum 등의 지역변수에 직접접근 불가
//anotherMethod 내에서 i와 sum 변수를 사용하려면 해당 변수들을 메서드의 매개변수로 전달하거나, 전역 변수로 선언하여 모든 메서드에서 공유할 수 있도록 해야함

