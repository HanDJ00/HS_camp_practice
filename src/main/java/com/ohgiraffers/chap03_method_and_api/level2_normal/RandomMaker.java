package com.ohgiraffers.chap03_method_and_api.level2_normal;

public class RandomMaker {
    public static int randomNumber(int min, int max) {
        // 최소값부터 최대값까지 범위의 난수 반환함

        return (int) (Math.random() * (max - min + 1))+ min;
    }

    public static String randomUpperAlphabet(int length) {
        String randomUpperAlphabet = "";
        for (int i = 0; i < length; i++){
            randomUpperAlphabet += (char)((int)((Math.random() * 26) + 65));
        }
        return randomUpperAlphabet;
    }

    public static String rockPaperScissors() {
        int hand_random = (int)(Math.random() * 3);
        String hand = "";
        if (hand_random == 0){
            return hand = "가위";
        }else if (hand_random == 1){
            return hand = "바위";
        }else {
            return hand = "보";
        }

    }

    public static String tossCoin() {
        int coin_random = (int)(Math.random() * 2);
        String coin = "";
        if (coin_random == 0){
            return coin = "앞면";
        } else {
            return coin = "뒷면";
        }
    }
}
