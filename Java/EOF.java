import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EOF {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int i = 0;
        while(s.hasNext()) {
         String phrase= s.nextLine();
         i++;
            System.out.println(i + " " + phrase);
         }
    s.close();
    }
}
