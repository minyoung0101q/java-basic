package com.example.javabasic.tutorial05;

public class Main {
    public static void main(String[] args) {
        int i = 20;
        i++; //i = i + 1과 동일, i += 1과 동일
        System.out.println((100<i) && (i<200));
    }
}
//<헷갈리는 연산자>
/*
* i++와 ++i는 단순히 값을 증가시키는 목적이라면 그 기능이 동일합니다.
* 100 < x < 200은 잘못된 표현, (100 < x) && (x < 200)로 표현하는 것이 올바른 연산 식 표현.
* i++는 i += 1과 동일한 표현, i = i + 1과도 동일한 표현, 모두 1만큼 증가시킨다는 의미를 가짐.
* */


//<논리적 흐름의 기본인 조건문 & 반복문>
/*
* byte(data type): 1byte(size) => 메모리상이 1byte만큼 공간을 차지하는 변수가 할당
* short: 2bytes => 작은 정수를 표현할 때 사용
* int : 4bytes => 약 -20억 ~ 20억에 해당하는 범위를 가짐
* long : 8bytes
* float : 4bytes
* double : 8bytes
* boolean 참 값과 거짓 값이 존재, not applicable
* char : 2bytes
* */
