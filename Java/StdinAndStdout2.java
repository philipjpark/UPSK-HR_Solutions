import java.util.Scanner;
public class StdinAndStdout2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
     int i = scan.nextInt();
     double d = scan.nextDouble();
      scan.nextLine();  // Encompasses left over newline. Basically without it, it will attach to the previous line.
        
   String s = scan.nextLine(); 

scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
