import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF LINES");
        int lines = sc.nextInt();
        int star;
        for(lines=1;lines<=4;lines++){
            for(star=1;star<=lines;star++){
                System.out.print( "*" );
            }
            System.out.println();
        }
        sc.close();

    }
}