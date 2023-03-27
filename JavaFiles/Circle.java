package JavaFiles;

import java.util.*;

// Circle 클래스
public class Circle {
    protected int radius; // protected로 선언하여 자식 클래스에서도 접근 가능하도록 함

    public Circle(int radius) {
        this.radius = radius;
    }

    public void show() {
        System.out.println("반지름이 " + radius + "인 원이다.");
    }
}

// ColoredCircle 클래스
class ColoredCircle extends Circle {
    private String color;

    public ColoredCircle(int radius, String color) {
        super(radius);
        this.color = color;
    }

    // Circle 클래스의 show() 메서드를 오버라이딩하여 빨간색을 추가로 출력함
    public void show() {
        System.out.println("반지름이 " + radius + "인 " + color + "색 원이다.");
    }
}

// 테스트 프로그램
class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.show();

        ColoredCircle coloredCircle = new ColoredCircle(10, "빨간");
        coloredCircle.show();
    }
}
