import java.util.*;
public class breakwhen10multiple{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
       /*  for(i=0;i<10;i++){
            System.out.println("ENTER NUMBER!");
            n=sc.nextInt();
            if(n%10==0){
                System.out.println("EXIT FROM THE LOOP");
                break;
            }
            System.out.println("NUMBER IS:-"+n);
        }*/
        do{
            System.out.println("ENTER YOUR NUMBER:-");
            n= sc.nextInt();
            if(n%10==0){
                System.out.println("EXIT FROM LOOP!!");
                break;
            }
            System.out.println("NUMBER IS:-"+n);
        }while(true);
        sc.close();
    }
}