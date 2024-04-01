class Animal {
  String name;
  public Animal(String name) {
    this.name = name;
  }
  public void makeSound() {
    System.out.println("Generic animal sound");
  }
}
class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }
  @Override 
  public void makeSound() {
    System.out.println("Woof!");
  }
}
public class SingleInheritanceExample {
  public static void main(String[] args) {
    Animal animal = new Animal("Creature"); 
    animal.makeSound(); 

    Dog dog = new Dog("Buddy"); 
    dog.makeSound(); 
  }
}
