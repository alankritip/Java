import java.util.*;
public class hollow_rectangle{
    public static void hollowrect(int row,int col){
        int r,c; 
        for(r=1;r<=row;r++){
            for(c=1;c<=col;c++){
                if(r==1||r==row||c==1||c==col){
                    System.out.print("*");
                }else{
                System.out.print(" ");
            }
            System.out.print(" ");
        }
        System.out.println();
        }

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER NO. OF ROWS AND COLUMNS:-");
    int row = sc.nextInt();
    int col = sc.nextInt();
    hollowrect(row, col);
}
}