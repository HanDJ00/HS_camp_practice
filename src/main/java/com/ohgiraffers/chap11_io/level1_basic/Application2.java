package com.ohgiraffers.chap11_io.level1_basic;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("원본 파일의 이름을 입력하세요 : ");
            String fileName = sc.nextLine();
            File file = new File(fileName);
            if (file.exists()){
                Path sourcePath = Paths.get(fileName); // 원본 파일 경로
                System.out.println("복사 파일의 이름을 입력하세요 : ");
                Path destinationPath = Paths.get(sc.nextLine());
                Files.copy(sourcePath, destinationPath);// 복사된 파일 경로
                System.out.println("파일이 성공적으로 복사되었습니다.");
            } else {
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("오류 : (지정된 파일을 찾을 수 없습니다)");
        }
        /* ----- 입력 예시 -----
         *
         * (원본 파일이 존재 하는 경우)
         * 원본 파일의 이름을 입력하세요 : origin.txt
         * 복사 파일의 이름을 입력하세요 : copy.txt
         *
         * ----- 출력 예시 -----
         *
         * 파일 복사가 성공적으로 완료 되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * (원본 파일이 존재하지 않는 경우)
         * 원본 파일의 이름을 입력하세요 : origin2.txt
         * 복사 파일의 이름을 입력하세요 : copy2.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
         *
         */

    }
}