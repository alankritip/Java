import java.util.*;
public class getters{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.getcolor("navy blue");
        System.out.println(p1.color);
        
    }
}
class Pen{
    String color;
    int tip;
    void getcolor(String color){
        this.color=color;
    }
    void getTip(int tip){
        this.tip=tip;
    }
}