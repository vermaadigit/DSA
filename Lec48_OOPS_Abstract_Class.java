public class Lec48_OOPS_Abstract_Class {
    public static void main(String[] args){

        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

    }
}

abstract class Animal5 {

    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void walk();

}

class Horse extends Animal5 {
    void walk() {
        System.out.println("Walks on 4 Legs");
    }
}

class Chicken extends Animal5 {
    void walk() {
        System.out.println("Walks on 2 Legs");
    }
}
