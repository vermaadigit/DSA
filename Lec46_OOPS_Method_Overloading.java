public class Lec46_OOPS_Method_Overloading {
    public static void main(String[] args){

        Calculator calc = new Calculator();
        System.out.println(calc.sum(3, 4));
        System.out.println(calc.sum(3.5F, 4.5F));
        System.out.println(calc.sum(3, 5, 7));

    }
}

class Calculator {

    int sum(int a, int b) {
        return a+b;
    }

    float sum(float a, float b) {
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}
