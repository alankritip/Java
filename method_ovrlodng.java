public class method_ovrlodng{
    public static void main(String[] args) {
     calculator cal = new calculator();
     System.out.println(cal.sum(5, 6));  
     System.out.println(cal.sum(5, 8, 9));
     System.out.println(cal.sum((float)(2.8),(float)(2.2)) );
    }
}
class calculator{
    int sum (int a, int b){
        return a+b;
    }
    int sum(int a ,int b , int c){
        return a+b+c;
    }
    float sum(float a, float b){
        return a+b;
    }
}