package com.ohgiraffers.chap13_collection.level1_basic;

import java.util.Scanner;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> urlStack = new Stack<>();

        while(true) {
            System.out.println("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            } else {
                urlStack.push(input);
            }

            int stackSize = urlStack.size();
            int startIndex = Math.max(0, stackSize - 5);
            System.out.print("최근 방문 url : [ ");
            for (int i = stackSize - 1; i >= startIndex; i--) {
                System.out.print(urlStack.get(i) + ", ");
            }
            System.out.println(" ]");
        }
    }
}
