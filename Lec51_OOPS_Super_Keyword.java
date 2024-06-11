public class Lec51_OOPS_Super_Keyword {
    public static void main(String[] args){

        Horse2 h1 = new Horse2();

    }
}

class Animal6 {
    Animal6() {
        System.out.println("animal constructor is called ");
    }
}

class Horse2 extends Animal6 {
    Horse2() {
        super();
        System.out.println("horse constructor is called");
    }
}
