public class Lec38_OOPS {
    public static void main(String[] args){
        Pen p1 = new Pen();    //Created Pen Object called p1
        p1.setColor("Blue");
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
