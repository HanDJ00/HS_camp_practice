package com.ohgiraffers.chap04_control_flow.looping.level4_advanced;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
         *
         * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
         * 지폐외 동전을 구분하여 단위를 표기하세요
         *
         * -- 입력 예시 --
         * 받으신 금액을 입력하세요 : 100000
         * 상품 가격을 입력하세요 : 22340
         *
         * -- 출력 예시 --
         * ============================
         * 50000원권 지폐 1장
         * 10000원권 지폐 2장
         * 5000원권 지폐 1장
         * 1000원권 지폐 2장
         * 500원권 동전 1개
         * 100원권 동전 1개
         * 50원권 동전 1개
         * 10원권 동전 1개
         * ============================
         * 거스름돈 : 77660원
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("받으신 금액을 입력하세요 : ");
        int client_money = scanner.nextInt();
        System.out.print("상품 금액을 입력하세요 : ");
        int product_money = scanner.nextInt();
        int first_charge_money = client_money - product_money;
        int charge_money = first_charge_money;

        System.out.println("============================");

        if (charge_money >= 50000) {
            System.out.println("50000원권 지폐 " + (charge_money / 50000) + "장");
            charge_money %= 50000;
        }
        if (charge_money >= 10000) {
            System.out.println("10000원권 지폐 " + (charge_money / 10000) + "장");
            charge_money %= 10000;

        }
        if (charge_money >= 5000) {
            System.out.println("5000원권 지폐 " + (charge_money / 5000) + "장");
            charge_money %= 5000;

        }
        if (charge_money >= 1000) {
            System.out.println("1000원권 지폐 " + (charge_money / 1000) + "장");
            charge_money %= 1000;

        }
        if (charge_money >= 500) {
            System.out.println("500원권 동전 " + (charge_money / 500) + "개");
            charge_money %= 500;

        }
        if (charge_money >= 100) {
            System.out.println("100원권 동전 " + (charge_money / 100) + "개");
            charge_money %= 100;

        }
        if (charge_money >= 50) {
            System.out.println("50원권 동전 " + (charge_money / 50) + "개");
            charge_money %= 50;

        }
        if (charge_money >= 10) {
            System.out.println("10원권 동전 " + (charge_money / 10) + "개");
            charge_money %= 10;
        }
        System.out.println("============================");
        System.out.println("거스름돈 : " + first_charge_money + "원");


    }

}
