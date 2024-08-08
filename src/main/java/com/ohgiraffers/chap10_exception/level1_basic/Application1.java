package com.ohgiraffers.chap10_exception.level1_basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            System.out.print("분자 입력 : ");
            int numerator = sc.nextInt();


            System.out.print("분모 입력 : ");
            int denominator = sc.nextInt();

            exceptionTest.check_zero(denominator);

            System.out.println("결과 : " + numerator / denominator);

        }  catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 정수를 입력해주세요.");
            sc.next();  // 잘못된 입력값을 소비하고 루프를 계속 진행합니다.
        }  catch (Exception e) {

        }
        System.out.println("실행이 완료되었습니다.");

        /* ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 2
         *
         * ----- 출력 예시 -----
         *
         * 결과 : 5
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 십
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 유효한 정수를 입력하세요.
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 0
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 0으로 나누는 것은 허용되지 않습니다.
         * 실행이 완료되었습니다.
         */

    }
}

class ExceptionTest {
    public void check_int (int num) throws Exception{
        if(num < 48 || num > 57){
            System.out.println("유효한 정수를 입력하세요.");
            throw new Exception();
        }
    }

    public void check_zero (int num) throws Exception{
        if(num == 0) {
            System.out.println("0으로 나누는 것은 허용되지 않습니다.");
            throw new Exception();
        }
    }
}