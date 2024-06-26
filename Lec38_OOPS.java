public class Lec38_OOPS {
    public static void main(String[] args){
        Pen p1 = new Pen();    //Created Pen Object called p1
        //p1.setColor("Blue");
        p1.color = "Black";
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //p1.setColor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);

    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int math){
        percentage =  (float) (phy + chem + math) / 3;
    }
}
