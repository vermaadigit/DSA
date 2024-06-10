public class Lec45_OOPS_hierarchial_Inheritance {
    public static void main(String[] args) {

        Fish1 f1 = new Fish1();

        f1.swim();

        Bird b1 = new Bird();

        b1.fly();

    }
}

class Animal2 {
    String color;

    void eat() {
        System.out.println("Eats");
    }
    void breathe() {
        System.out.println("Breathes");
    }
}

class Mammal1 extends Animal2 {
    void walk() {
        System.out.println("Walks");
    }
}

class Bird extends Animal2 {
    void fly() {
        System.out.println("Swim");
    }
}

class Fish1 extends Animal2 {
    void swim() {
        System.out.println("Swims");
    }
}
