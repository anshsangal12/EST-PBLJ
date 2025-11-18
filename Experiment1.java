interface Animal {
    void sound(); 

    default void sleep() {
        System.out.println("Sleeping...");
    }

    static void info() {
        System.out.println("Animal Interface");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Experiment1{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();
        Animal.info();
    }
}
