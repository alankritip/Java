import java.util.*;
public class mn{
    public static void dec_to_bin(int dec){
        int rem=0;int bin=0; int power=0;
        while(dec>0){
            rem = dec%2;
            bin = bin + rem*(int)(Math.pow(10,power));
            power++;
            dec=dec/2;
        }
        System.out.println("BINARY FORM IS:-"+bin);
    }
    public static void bin_to_dec(int bin){
        int dec =0;int power = 0;int last;
        while(bin>0){
            last= bin%10;
            dec = dec + last*(int)(Math.pow(2, power));
            power++;
            bin=bin/10;
        }
        System.out.println("DECIMAL NUMBER IS :-"+dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTE DECIMAL NUBER:-");
        int dec = sc.nextInt();
        dec_to_bin(dec);
        System.out.println("ENTER BINARY NUMBER:-");
        int bin = sc.nextInt();
        bin_to_dec(bin);

    }
}