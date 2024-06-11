public class Lec47_OOPS_Method_Overriding {
    public static void main(String[] args){
        Deer d = new Deer();
        d.eat();

    }
}

class Animal4 {
    void eat() {
        System.out.println("Eats Everything !");
    }
}

class Deer extends Animal4 {
    void eat() {
        System.out.println("Eats only Grass !");
    }
}
