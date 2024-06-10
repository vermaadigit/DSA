public class Lec43_OOPS_Inheritance {
    public static void main(String[] args){

        Fish shark = new Fish();
        shark.eat();

    }
}

//Base Class ----->
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }
    void breathe() {
        System.out.println("Breathes");
    }
}

//Derived Class or Sub Class -------->
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in Water");
    }
}
