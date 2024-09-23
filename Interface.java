interface Animal {
    void sound();
}

interface Playbale{
    void play();
}

class Dog implements Animal, Playbale {
    @Override
    public void sound() {
        System.out.println("bark");
    }
    @Override
    public void play() {
        System.out.println("the dog is playing");
    }
}
public class Interface {
    public static void main (String[]args){
        Dog dog = new Dog();
        dog.sound();
        dog.play();
    }
}
