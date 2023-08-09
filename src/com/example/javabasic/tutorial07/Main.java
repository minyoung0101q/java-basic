package com.example.javabasic.tutorial07;

public class Main {
    public static void main(String[] args) {
        int count = 0;

        for(;;) {
            System.out.println("출력");
            count++;
            if(count == 10) {
                break; //가장 가까운 반복문을 탈출시켜주는 구문, count가 10이 될 때는 이 반복문을 탈출함
            }
        }
    }
}
/* for(;;)는 while(true)와 똑같이 무한 루프라는 의미로 동작함 */
/* break; 활용해서 반복문을 즉시 빠져나올 수 있음 */
/* for문과 while문은 얼마든지 중첩될 수 있음 */