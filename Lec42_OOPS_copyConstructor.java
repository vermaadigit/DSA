public class Lec42_OOPS_copyConstructor {
    public static void main(String[] args){
        Student2 s1 = new Student2();

        s1.name = "Aditya";
        s1.roll = 123;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student2 s2 = new Student2(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }


//        Student2 s3 = new Student2("Vermaji");
//        Student2 s4 = new Student2(321);
    }
}

class Student2 {
    String name;
    int roll;
    String password;
    int marks[];

    //Copy Constructor
    Student2(Student2 s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student2() {
        marks = new int[3];
        System.out.println("Constructor is called ....");
    }
    Student2(String name){
        marks = new int[3];
        this.name = name;
    }
    Student2(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}
