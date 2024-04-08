import java.util.*;
public class bitwise_operator{
    public static void main(String[] args) {
        System.out.println("5 & 6 => "+(5&6));//binary AND operator
        System.out.println("5 | 6 => "+(5|6));//binary OR operator
        System.out.println("5 ^ 6 => "+(5^6));//binary XOR operator
        System.out.println("~ 5 => "+(~5));//binary ONE'S COMPLEMENT
        System.out.println("(~0) << 1 => "+((~0)<<1));//binary LEFT SHIFT
        System.out.println("5 >> 10 => "+(5>>10));//binary RIGHT SHIFT
    }
}