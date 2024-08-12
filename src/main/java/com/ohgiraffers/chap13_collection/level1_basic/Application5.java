package com.ohgiraffers.chap13_collection.level1_basic;

import java.util.Scanner;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> tset = new TreeSet<>();

        while(true){
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String input = sc.nextLine();

            if(input.equals("exit")){
                System.out.print("정렬 된 단어 : [");
                for(String s : tset) {
                    System.out.print(s + ", ");
                }
                System.out.println("]");
                break;
            }else {
                tset.add(input);
            }
        }

    }
}
