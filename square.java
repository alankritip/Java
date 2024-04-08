import java.util.*;
public class square{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("input side of a square");
        int side = sc.nextInt();
        float area = (side*side);
        System.out.println("area of square is"+area);
        sc.close();
    }
}