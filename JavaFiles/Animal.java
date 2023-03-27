package JavaFiles;

// Animal 클래스 정의
class Animal {
    protected String name;
    
    public Animal(String name) {
      this.name = name;
    }
    
    public void eat() {
      System.out.println(name + " is eating.");
    }
    
    public void sleep() {
      System.out.println(name + " is sleeping.");
    }
  }
  
  // Dog 클래스 정의
  class Dog extends Animal {
    public Dog(String name) {
      super(name);
    }
    
    public void bark() {
      System.out.println(name + " is barking.");
    }
  }
  
  // Cat 클래스 정의
  class Cat extends Animal {
    public Cat(String name) {
      super(name);
    }
    
    public void meow() {
      System.out.println(name + " is meowing.");
    }
  }
  
  // 메인 클래스
  /*public*/ class Main {
    public static void main(String[] args) {
      Dog myDog = new Dog("Buddy");
      Cat myCat = new Cat("Mittens");
      
      myDog.eat();    // 출력: Buddy is eating.
      myDog.sleep();  // 출력: Buddy is sleeping.
      myDog.bark();   // 출력: Buddy is barking.
      
      myCat.eat();    // 출력: Mittens is eating.
      myCat.sleep();  // 출력: Mittens is sleeping.
      myCat.meow();   // 출력: Mittens is meowing.
    }
  }

/*
Animal 클래스를 정의하고, 이를 상속받는 Dog 클래스와 Cat 클래스를 정의합니다. 
Animal 클래스에는 name 변수와 eat()과 sleep() 메소드가 있으며, 
Dog 클래스와 Cat 클래스는 각각 bark()와 meow() 메소드를 추가로 정의합니다. 
이렇게 하면, 각각의 객체는 자신의 이름을 가지고 알맞은 메소드를 실행할 수 있게 됩니다.
메인 클래스에서는 Dog와 Cat 객체를 생성하여 각각의 메소드를 호출합니다. 
예를 들어, myDog.eat() 메소드를 호출하면 "Buddy is eating."이라는 문장이 출력됩니다.
이 예제에서는 static 메소드를 사용하지 않았으며, 각 메소드는 하나의 기능만 수행합니다. 
*/
  
