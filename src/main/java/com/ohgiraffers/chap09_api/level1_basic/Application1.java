package com.ohgiraffers.chap09_api.level1_basic;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String string = sc.nextLine();
        String[] upper = string.split(" ");
        for (int i = 0; i < upper.length; i++) {
            upper[i] = upper[i].substring(0, 1).toUpperCase() + upper[i].substring(1);
            System.out.print(upper[i] + " ");
        }


        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

    }
}