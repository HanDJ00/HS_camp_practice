package com.ohgiraffers.chap06_class_and_object.practice2;

public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO() {}

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getInformation() {
        return "학년=" + this.grade + ", 반=" + this.classroom + ", 이름=" + this.name + ", 국어=" + this.kor + ", 영어=" + this.eng + ", 수학=" + this.math + ", 평균=" + ((this.kor + this.eng +this.math) / 3 );
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade(int grade) {
        return grade;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public int getClassroom(int classroom) {
        return classroom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getKor(int kor) {
        return kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getEng(int eng) {
        return eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getMath(int math) {
        return math;
    }





}
