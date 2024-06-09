public class Lec41_OOPS_Constructor {
    public static void main(String[] args){

        Student1 s1 = new Student1("Aditya", 56);
        System.out.println(s1.name);
        System.out.println(s1.roll);
    }
}

class Student1 {
    String name;
    int roll;

    Student1(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
}
