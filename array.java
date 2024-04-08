import java.util.*;
public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:-");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("enter subject marks:-");
        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
        for(int j=0;j<marks.length;j++){
            System.out.println("ENTERED MARKS:-"+marks[j]);
        }
        sc.close();
    }
}