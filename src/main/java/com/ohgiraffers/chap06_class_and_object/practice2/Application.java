package com.ohgiraffers.chap06_class_and_object.practice2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] studentDTOS = new StudentDTO[10];

        Scanner scanner = new Scanner(System.in);

        char token = 'y';
        int index = 0;
        while (token == 'y' || token == 'Y') {


            token = 'y';
            System.out.print("학년 : ");
            int student_grade = scanner.nextInt();
            System.out.print("반 : ");
            int student_classroom = scanner.nextInt();
            System.out.print("이름 : ");
            String student_name = scanner.next();
            System.out.print("국어점수 : ");
            int student_kor = scanner.nextInt();
            System.out.print("영어점수 : ");
            int student_eng = scanner.nextInt();
            System.out.print("수학점수 : ");
            int student_math = scanner.nextInt();

            studentDTOS[index] = new StudentDTO(student_grade, student_classroom,student_name,student_eng,student_kor,student_math);
            index++;

            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            token = scanner.next().charAt(0);
        }

        for (int i = 0; i < index; i++) {
            System.out.println(studentDTOS[i].getInformation());
        }

    }
}
