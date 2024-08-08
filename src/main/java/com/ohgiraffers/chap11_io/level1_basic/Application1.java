package com.ohgiraffers.chap11_io.level1_basic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("파일 이름을 입력하세요 : ");
            File file = new File(sc.nextLine());
            if (file.exists()) {
                int value;
                fis = new FileInputStream(file);
                while((value = fis.read()) != -1 ){
                    System.out.print((char)value);
                }

            }else{
                throw new Exception();
            }

        }catch (Exception e){
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        }
        /* ----- 입력 예시 -----
         *
         * (존재하는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : hello.txt
         *
         * ----- 출력 예시 -----
         *
         * ===== 파일 내용 출력 =====
         * 안녕하세요. 반갑습니다. 제 이름은 홍길동입니다.
         *
         * ----- 입력 예시 -----
         *
         * (존재하지 않는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : unknown.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 해당 이름을 가진 파일이 없습니다.
         *
         */

    }
}

