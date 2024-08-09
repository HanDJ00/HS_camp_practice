package com.ohgiraffers.chap11_io.level02_normal;

import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("병합할 파일의 개수 입력 : ");
            int numberOfFiles = sc.nextInt();
            sc.nextLine();

            String[] fileNames = new String[numberOfFiles];
            for (int i = 0; i < numberOfFiles; i++) {
                System.out.print((i + 1) + " 번째 파일 이름 입력 : ");
                fileNames[i] = sc.nextLine();
            }


            System.out.print("병합 될 파일명 입력 : ");
            String outputFileName = sc.nextLine();


            mergeFiles(fileNames, outputFileName);
            System.out.println("파일 병합이 완료 되었습니다.");

        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
        }

        sc.close();
    }

    public static void mergeFiles(String[] fileNames, String outputFileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String fileName : fileNames) {
                File file = new File(fileName);

                if (!file.exists()) {
                    throw new FileNotFoundException(fileName + " (지정된 파일을 찾을 수 없습니다)");
                }

                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }
}

//        병합할 파일의 개수 입력 : 3
//        1 번째 파일 이름 입력 : test.txt
//        2 번째 파일 이름 입력 : test2.txt
//        3 번째 파일 이름 입력 : test3.txt
//        병합 될 파일명 입력 : result.txt
//        파일 병합이 완료 되었습니다.
//
//        병합할 파일의 개수 입력 : 2
//        1 번째 파일 이름 입력 : test.txt
//        2 번째 파일 이름 입력 : test4.txt
//        병합 될 파일명 입력 : result.txt
//        오류 : test4.txt (지정된 파일을 찾을 수 없습니다)

