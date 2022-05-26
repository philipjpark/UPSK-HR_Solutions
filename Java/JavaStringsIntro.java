import java.io.*;
import java.util.*;

public class JavaStringsIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String sum= A + B;
        
        char charArrA[] = A.toCharArray(), charArrB[] = B.toCharArray();
        
        System.out.println(sum.length());
        
        if ( charArrA[0] > charArrB[0]) 
         System.out.println("Yes");
        else System.out.println("No");
        
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
        
        
        
    }
}