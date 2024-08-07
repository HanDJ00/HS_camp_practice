package com.ohgiraffers.chap09_api.level1_basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String string = sc.nextLine().toLowerCase();
        String english_string = "";

        for (int i = 0; i < string.length(); i++) {
            if ((string.charAt(i) >= 'a' && string.charAt(i) <= 'z') || (int)string.charAt(i) == 32) {
                english_string += string.charAt(i);
            }
        }

        String[] split_string = english_string.split(" ");
        String[] words = new String[split_string.length];
        int[] words_count = new int[split_string.length];
        int index = 0;
        int token = 0;

        for (int i = 0; i < split_string.length; i++) {
            for(int j = 0; j < split_string.length; j++){
                if(split_string[i].equals(words[j])){
                    words_count[j]++;
                    token = 1;
                    break;
                }
            }
            if(token == 0){
                words[index] = split_string[i];
                words_count[index++]++;
            }
            token = 0;


        }

        int max_count = 0;
        int max_index = 0;

        System.out.println("===== 단어 빈도 =====");
        for (int i = 0; i < words.length; i++) {
            if(words_count[i] != 0){
                if(max_count < words_count[i]){
                    max_count = words_count[i];
                    max_index = i;
                }
                System.out.println(words[i] + ": " + words_count[i]);
            }
        }
        System.out.println("가장 빈도 높은 단어 : " + words[max_index] + " (" + max_count + " 번)");



        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */

    }
}