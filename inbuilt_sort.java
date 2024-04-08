import java.util.*;//only this package contains the classes of main function
 import java.util.Arrays;//it does not contain Scanner class
public class inbuilt_sort{
public static void printar(int ar[]){
    System.out.println("SORTED ELEMENTS:-");
    for(int i=0;i<ar.length;i++){
        System.out.println(ar[i]);
    }
    System.out.println();
}
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:-");
        int n = sc.nextInt();
        int ar[]=new int[n];
        System.out.println("ENTER THE ELEMENTS IN ARRAY:-");
        for(int i=0;i<n;i++){
            ar[i]= sc.nextInt();
        }
        Arrays.sort(ar,0,3); //array ia sorted in ascending order
//it is sorted from 0 to (2) index where (2) is not written as it is non-inclusive type
        printar(ar);
       }
    
}
