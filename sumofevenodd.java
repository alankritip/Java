import java.util.*;
public class sumofevenodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTE THE LIMIT OF SERIES:-");
        int n = sc.nextInt();
        int i,s1=0,s2=0;
        System.out.println("SERIES IS:-");
        for(i=1;i<=n;i++){
            System.out.println(i);
            if(i%2==0){
                s1=s1+i;
            }else{
                s2=s2+i;
            }
        }
        System.out.println("SUM OF EVEN INTEGERS :-"+s1);
        System.out.println("SUM OF ODD INTEGERS :-"+s2);
    sc.close();
}
}