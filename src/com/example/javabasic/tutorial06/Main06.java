package com.example.javabasic.tutorial06;

public class Main06 {
    static int globalVar = 10;

    public static void main(String[] args) {
        int i = 1, sum = 0;
        while(i <= 1000) {
            sum += i++;
        }
        System.out.println("1부터 1000까지의 합은" + sum + "입니다.");

        anotherMethod(i, sum);
    }

    public static void anotherMethod(int i, int sum) {
        System.out.println("anotherMethod 내에서 i 변수 값: " + i);
        System.out.println("anotherMethod 내에서 sum 변수 값: " + sum);
        System.out.println("전역 변수 값: " + globalVar);
    }
}
/* static 키워드는 클래스의 멤버(변수, 메서드)를 정의할 때 사용되며, 해당 멤버가 인스턴스 생성 없이 클래스 자체에 속하도록 만듭니다.
* static으로 선언된 멤버는 해당 클래스의 모든 인스턴스에서 공유되며, 클래스의 이름을 통해 접근할 수 있습니다.
*  */

/* 전역 변수의 공유 : globalVar를 전역 변수로 선언하고 static 키워드를 사용하면, 이 변수는 클래스 Main06의 모든 인스턴스에서 공유됩니다.
*  이로써 모든 메서드에서 globalVar에 접근하고 값을 공유할 수 있습니다. */
/* main 메서드 내부에서 사용 : main 메서드에서 globalVar를 사용하기 위해서는 static 키워드를 사용해야 합니다.
* main 메서드는 static 메서드이기 때문에 인스턴스를 생성하지 않고도 호출되어야 합니다. 따라서 globalVar도 static으로 선언하여 main 메서드 내부에서 사용 가능하게 만들어야 합니다.
*  */

