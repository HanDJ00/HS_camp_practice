package com.ohgiraffers.chap08_polymorphism.level1_basic;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index;

    public ShapeManager() {}

    public void addShape(Shape shape) {
        // 배열이 가득 찼을 경우 크기를 2배로 늘림
        if (index >= shapes.length) {
            Shape[] newShapes = new Shape[shapes.length * 2]; // 새 배열 생성
            System.arraycopy(shapes, 0, newShapes, 0, shapes.length); // 기존 배열 복사
            shapes = newShapes; // 새로운 배열을 기존 배열로 대체
        }
        shapes[index++] = shape; // 새로운 Shape 객체 추가
    }

    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
        for (int i = 0; i < index; i++) {
            if (shapes[i] == shape) {
                shapes[i] = null;
                for(int j = i; j < index; j++) {
                    shapes[j] = shapes[j+1];
                }
                index--;
                break;
            }
        }
    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for (int i = 0; i < index; i++) {
            System.out.println("Shape : " + shapes[i].getClass().getSimpleName());
            System.out.println("Area : " + shapes[i].calculateArea());
            System.out.println("Perimeter : " + shapes[i].calculatePerimeter());
        }
    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double sum = 0;
        for (int i = 0; i < index; i++) {
            sum += shapes[i].calculateArea();
        }
        return sum;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        double sum = 0;
        for (int i = 0; i < index; i++) {
            sum += shapes[i].calculatePerimeter();
        }
        return sum;
    }
}
