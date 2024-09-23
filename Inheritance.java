//superclass
class Animal {
    public void eat (){
        System.out.println("The animal is eating");
    }
}

//subclass

class Dog extends Animal {
    public void bark (){
        System.out.println("The animal is barking");   
    }
}

public class Inheritance {

 public static void main (String[]args){
   // String dog = new String();
   Dog dog = new Dog ();
   dog.eat();
   dog.bark();
 }
}