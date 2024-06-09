public class Lec40_OOPS_Getters_Setters {
    public static void main(String[] args){

        Link p1 = new Link();

        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(10);
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Link {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}
