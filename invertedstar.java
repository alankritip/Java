import java.util.*;
public class invertedstar{
    public static void main(String[] args) {
        int i,j;
        /*for (i=1;i<=4;i++){
            for(j=1;j<=4-i+1;j++){ n=4;
                System.out.print("*");
            }
            System.out.println();
        } */
        for(i=1;i<=4;i++){ 
            for(j=4;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
       
    }
}