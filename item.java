import java.util.*;
public class item{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE COST OF PEN,PENCIL,ERASER");
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float ttl = (pen + pencil + eraser);
        System.out.println("TOTAL BILL :-"+ttl);
        float gst = (18f/100f)*ttl;
        float sum = gst+ttl;
        System.out.println("TOTAL BILL WITH GST :-"+sum);
        sc.close();
    }

}