package com.ohgiraffers.chap13_collection.level1_basic;

import java.util.HashSet;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hset = new HashSet<>();

        while(true){
            System.out.print("학생 ID 입력('exit' 입력 시 종료):");
            String id = sc.nextLine();

            if(id.equals("exit")){
                System.out.print("모든 학생의 ID : [");
                for(String s : hset){
                    System.out.print(", "  + s);
                }
                System.out.println("]");
                break;
            }else{
                if(!hset.add(id)){
                    System.out.println("이미 등록 된 ID입니다.");
                }else {
                    System.out.println("ID가 추가 되었습니다.");
                }
            }
        }


    }
}
