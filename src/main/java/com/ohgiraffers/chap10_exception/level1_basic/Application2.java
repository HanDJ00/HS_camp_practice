package com.ohgiraffers.chap10_exception.level1_basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        InvaildAgeException invaildAgeException = new InvaildAgeException();
        try {
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
            String date = sc.nextLine();
            invaildAgeException.check_InvaildAgeException(date);
            invaildAgeException.check_adult(date);

            System.out.println("입장하셔도 됩니다.");

        } catch (InvaildAgeException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } catch (Exception e) {
            System.out.println("만 20세 미만은 입장 불가입니다.");
        }
        /* ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
         *
         * ----- 출력 예시 -----
         *
         * 만 20세 미만은 입장 불가입니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05
         *
         * ----- 출력 예시 -----
         *
         * 입장하셔도 됩니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
         *
         * ----- 출력 예시 -----
         *
         * 날짜 양식을 잘못 입력하셨습니다.
         */

    }

}

class InvaildAgeException extends Exception {
    public void check_InvaildAgeException(String date) throws Exception {
        for (int i = 0; i < 4; i++) {
            if ((int)date.charAt(i) < 48 || (int)date.charAt(i) > 57) {
                throw new InvaildAgeException();
            }
        }

        if (date.charAt(4) != '-') {
            throw new InvaildAgeException();

        }

        for (int i = 5; i < 7; i++) {
            if ((int)date.charAt(i) < 48 || (int)date.charAt(i) > 57) {
                throw new InvaildAgeException();
            }
        }
        if (date.charAt(7) != '-') {
            throw new InvaildAgeException();

        }
        for (int i = 8; i < 10; i++) {
            if ((int)date.charAt(i) < 48 || (int)date.charAt(i) > 57) {
                throw new InvaildAgeException();

            }
        }
    }

    public void check_adult (String date) throws Exception {
        int date1 = 0;
        int times = 1000;
        for(int i = 0; i < 4 ; i++){
            date1 +=((int)date.charAt(i) - 48) * times;
            times /= 10;
        }
        if(date1 > 2005){
            throw new Exception();
        }
    }

//    public InvaildAgeException() {
//        System.out.println("날짜 양식을 잘못 입력하셨습니다.");
//    }
}