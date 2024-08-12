package com.ohgiraffers.chap13_collection.level1_basic;

import java.util.HashMap;
import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap();

        while (true) {

            System.out.println("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("search")) {
                System.out.println("검색 할 이름 : ");
                String name = sc.nextLine();
                String phoneNumber = map.get(name);
                if (phoneNumber != null) {
                    System.out.println(name + "씨의 전화번호 : " + phoneNumber);
                } else {
                    System.out.println(name + "씨의 전화번호는 등록 되어 있지 않습니다.");
                }
            } else {
                String[] parts = input.split(" ");

                if (parts.length != 2) {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");

                } else {
                    String name = parts[0];
                    String phoneNumber = parts[1];

                    map.put(name, phoneNumber);
                    System.out.println("추가 완료 : " + name + " " + phoneNumber);

                }

            }
        }
    }
}

