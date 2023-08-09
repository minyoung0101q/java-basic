package com.example.javabasic.tutorial07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter; // PrintWriter를 import합니다.
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        // 파일에 정수를 쓰기 위해 PrintWriter를 사용합니다.
        try {
            PrintWriter writer = new PrintWriter("input.txt"); // 파일 이름은 소문자로 변경
            writer.println(5); // 첫 번째 줄에 5를 입력
            writer.println(8); // 두 번째 줄에 8을 입력
            writer.println(9); // 세 번째 줄에 9를 입력
            writer.println(7); // 네 번째 줄에 7을 입력
            writer.close(); // 파일을 닫습니다.
        } catch (FileNotFoundException e) {
            System.out.println("파일을 쓰는 도중에 오류가 발생했습니다.");
        }
        // 파일을 읽습니다.
        File file = new File("input.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt() * 100);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
        }
    }
}
// 파일 입출력 같은 경우 다양한 해킹 기법에도 응용됨