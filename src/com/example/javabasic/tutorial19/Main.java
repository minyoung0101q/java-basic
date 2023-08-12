package com.example.javabasic.tutorial19;

public class Main extends Parent {
//    public void show() { -> 함수 재정의 안 됨
//        System.out.println("오버라이딩 불가");
//    }
    public static void main(String[] args) {
        final int number = 10; //상수 정의
        //number = 5; //오류 발생 -> 상수는 값 바꿀 수 없음
        System.out.println(number);

        Main main = new Main();
        main.show();
    }
}
/* 최종(Final) : 자바에서 최종(Final)의 쓰임을 알아봅니다.
* 자바에서 절대 변하지 않는 특정한 것을 정하고 싶을 때는 최종(Final)을 사용합니다.
* 이 키워드는 변수, 메소드 클래스에 모두 사용할 수 있습니다.
* 변수에 사용할 경우 변하지 않는 상수가 되며, 메소드가 사용할 때는 재정의가 불가능한 메소드가 되며, 클래스에 사용할 때는 상속이 불가능한 하나의 완전한 클래스가 되는 것입니다.
* */

/* 자바에서 최종(Final)의 개념을 바르게 학습합니다.
* - Final 키워드를 사용한 변수를 다루어봅니다.
* - Final 키워드를 사용한 메소드를 다루어봅니다.
* - Final 키워드를 사용한 클래스를 다루어봅니다.
*  */
