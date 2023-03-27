// Shape 클래스 정의
function Shape(name) {
    this.name = name;
  }
  
  Shape.prototype.area = function() {
    throw new Error("Shape.area() must be overridden");
  };
  
  // Circle 클래스 정의
  function Circle(name, radius) {
    Shape.call(this, name);
    this.radius = radius;
  }
  
  Circle.prototype = Object.create(Shape.prototype);
  Circle.prototype.constructor = Circle;
  Circle.prototype.area = function() {
    return Math.PI * this.radius * this.radius;
  };
  
  // Square 클래스 정의
  function Square(name, side) {
    Shape.call(this, name);
    this.side = side;
  }
  
  Square.prototype = Object.create(Shape.prototype);
  Square.prototype.constructor = Square;
  Square.prototype.area = function() {
    return this.side * this.side;
  };
  
  // 메인 함수
  function main() {
    var shapes = [];
    shapes.push(new Circle("Circle", 5));
    shapes.push(new Square("Square", 4));
    
    for (var i = 0; i < shapes.length; i++) {
      var shape = shapes[i];
      console.log(shape.name + " has an area of " + shape.area());
    }
  }
  
  main();
  