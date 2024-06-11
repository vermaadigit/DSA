public class Lec50_OOPS_Static_Keyword {
    public static void main(String[] args){

        Student3 s1 = new Student3();
        //s1.schoolName = "JNV";
        System.out.println(s1.schoolName);

        Student3 s2 = new Student3();
        System.out.println(s2.schoolName);

        Student3 s3 = new Student3();
        s3.schoolName = "ABC";
    }
}

class Student3 {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
