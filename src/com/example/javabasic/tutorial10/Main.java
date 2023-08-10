package com.example.javabasic.tutorial10;

public class Main {
    public static int function(int number, int k) { //매개변수: 함수가 내부적으로 처리하기 위한 어떠한 값들이 들어오는 곳
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                k--;
                if(k == 0) {
                    return i; //현재의 i가 약수
                }
            }
        }
        return -1; //약수를 차지 못했다면 -1을 반환해서 함수가 비정상적으로 종료됨을 알림
    }
    public static void main(String[] args) { //main 메서드가 종료되면 프로그램이 종료되기 때문에 반환형은 없다고 선언 -> void, String[] args : 처음에 콘솔 창에서 프로그램을 실행할 때 어떠한 인자 값을 넣어주는 것을 의미 -> 거의 사용되지 않기에 신경 쓸 필요는 없음
        int result = function(3050, 10);
        if(result == -1) {
            System.out.println("3050의 10번재 약수는 없습니다.");
        }
        else {
            System.out.println("3050의 10번째 약수는" + result + "입니다.");
        }
    }
}
//3050의 10번째 약수를 찾는 프로그램