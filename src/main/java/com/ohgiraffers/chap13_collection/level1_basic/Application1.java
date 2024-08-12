package com.ohgiraffers.chap13_collection.level1_basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList alist = new ArrayList();
        char token = 'y';
        int sum = 0;
        double average = 0;

        while (token == 'y') {
            System.out.print("학생 성적 : ");
            alist.add(sc.nextInt());
            System.out.print("추가 입력하려면 y : ");
            token = Character.toLowerCase(sc.next().charAt(0));

        }

        for (int i = 0; i < alist.size(); i++) {
            sum += Integer.parseInt(alist.get(i).toString());
        }

        average = sum / alist.size();


        System.out.println("학생 인원 : " + alist.size());
        System.out.println("평균 점수 : " + average);


    }
}
