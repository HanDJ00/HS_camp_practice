package com.ohgiraffers.chap04_control_flow.looping.level3_hard;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 2보다 큰 정수를 하나 입력 받아 그 수가 소수인지 아닌지를 판별해서 출력하세요
         * 소수인 경우 "소수다." 출력, 소수가 아닌 경우 "소수가 아니다." 출력
         *
         * 단, 2보다 큰 정수가 아닌 경우 "잘못 입력하셨습니다. 다시 입력하세요." 라고 출력 후
         * 정수를 다시 입력 받을 수 있도록 한다.
         *
         * 소수란?
         * 어떤 수를 1부터 자기 자신까지 차례대로 나누었을 때
         * 나누어 떨어지는 수가 1과 자기 자신만 존재하는 수를 소수라고 한다.
         *
         * -- 입력 예시 --
         * 2보다 큰 정수를 하나 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 소수다.
         *
         *
         * */

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int num = 0;
        do{
            System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
            num = scanner.nextInt();
            if (num < 2){
                System.out.print("잘못 입력하셨습니다. 다시 입력하세요. ");
            }else break;
        }while(true);

        if (num < 2){
            System.out.println("잘못 입력하셨습니다. 다시 입력하세요..");
            count = 1;
        }
        if (num == 2){
            System.out.println("소수다.");
            count = 1;
        }
        for (int i =  2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("소수가 아니다.");
                count = 1;
                break;
            }

        }
        if (count == 0){
            System.out.println("소수다.");
        }

    }

}
