public class inheritence {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

// Base Class
class Animal {
    String color;

    void breathe() {
        System.out.println("breathes");

    }

    void eat() {
        System.out.println("eats");
    }
}

// Derived Class
// class Fish extends Animal {
// int fins;

// void Swims() {
// System.out.println("swims in water");
// }

// }

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}