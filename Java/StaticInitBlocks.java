import java.util.*;

public class StaticInitBlocks {

static int B;
static int H;
static boolean flag = true;
    static {
        Scanner s = new Scanner(System.in);
        B = s.nextInt();
        H = s.nextInt();
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
        s.close();
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
