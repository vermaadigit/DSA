public class Lec44_OOPS_multiLevel_Inheritance {
    public static void main(String[] args){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.breathe();
        dobby.color = "Black";
        System.out.println("Dobby's Color is " + dobby.color);
        dobby.legs = 4;
        System.out.println(dobby.legs);
        dobby.breed = "German Sephardi";
        System.out.println(dobby.breed);
    }
}

class Animal1 {
    String color;

    void eat() {
        System.out.println("Eats");
    }
    void breathe() {
        System.out.println("Breathes");
    }
}

class Mammal extends Animal1 {
    int legs;
}

class Dog extends Mammal {
    String breed;
}
