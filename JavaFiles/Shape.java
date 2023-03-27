package JavaFiles;

// Shape 클래스 정의
abstract class Shape {
    protected String name;
    
    public Shape(String name) {
      this.name = name;
    }
    
    public abstract double area();
  }
  
  // Circle 클래스 정의
  class Circle extends Shape {
    protected double radius;
    
    public Circle(String name, double radius) {
      super(name);
      this.radius = radius;
    }
    
    public double area() {
      return Math.PI * radius * radius;
    }
  }
  
  // Square 클래스 정의
  class Square extends Shape {
    protected double side;
    
    public Square(String name, double side) {
      super(name);
      this.side = side;
    }
    
    public double area() {
      return side * side;
    }
  }
  
  // 메인 클래스
  /*public*/ class Main {
    public static void main(String[] args) {
      Shape[] shapes = new Shape[2];
      shapes[0] = new Circle("Circle", 5);
      shapes[1] = new Square("Square", 4);
      
      for (Shape shape : shapes) {
        System.out.println(shape.name + " has an area of " + shape.area());
      }
    }
  }

/*
Shape 클래스를 정의하고, 이를 상속받는 Circle 클래스와 Square 클래스를 정의합니다. 
Shape 클래스에는 name 변수와 area() 메소드가 있으며, 이를 각 클래스에서 오버라이딩하여 도형의 면적을 계산하게 됩니다.
메인 클래스에서는 Shape 배열을 생성하고, Circle과 Square 객체를 각각 생성하여 배열에 저장합니다. 
그리고 반복문을 통해 각 객체의 이름과 면적을 출력합니다. 예를 들어, Circle 객체의 면적은 Math.PI * radius * radius로 계산되며, 
"Circle has an area of 78.53981633974483"이라는 문장이 출력됩니다.
이 예제에서는 abstract 클래스와 메소드, 오버라이딩, 다형성 등의 개념을 다루고 있습니다. 
각 도형은 Shape 타입으로 선언되었지만, 실제 객체는 각각 Circle과 Square이므로, 이를 통해 다형성을 구현하고 있습니다.
*/  
  
