import java.util.*;
import java.io.*;
import java.math.*;

public class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int series = a;
            for (int j = 0; j < n; j++) {
                series += (Math.pow(2,j)* b);
                System.out.print(series + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
