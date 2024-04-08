public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen();
        // p1.setColor("blue"); // setters in java
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        p1.color = "YELLOW";
        p1.tip = 3;
        System.out.println(p1.color);
        System.out.println(p1.tip);
        bankAccount ba = new bankAccount();
        ba.username = "u too";
        System.out.println(ba.username);
    }

}
class bankAccount{
    public String username;
    private String password;
    public void setPassword(String pass){//creating a function inside the class to access to enter or change password
        password=pass;
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){//setters in java
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}