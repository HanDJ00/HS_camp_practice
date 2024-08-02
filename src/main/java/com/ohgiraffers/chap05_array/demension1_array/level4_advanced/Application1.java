package com.ohgiraffers.chap05_array.demension1_array.level4_advanced;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {

        /* 로또번호 생성기
         * 6칸 짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
         * */

        int[] lotto = new int[6];
        int count = 0;
        int token = 0;
        while (lotto[5] == 0){
            int random_int = ((int) ((Math.random() * 45 + 1)));
            for (int i = 0; i < lotto.length; i++) {
                if (lotto[i] == random_int) token = 1;
            }
            if (token == 0){
                lotto[count] = random_int;
                count++;
            }
            token = 0;
        }
        Arrays.sort(lotto);
        for(int i : lotto)
            System.out.println(i);
    }

}