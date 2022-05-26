import java.util.Scanner;
public class CompareTo {
    

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = ""; //alphabetically organized first 3-letter string.
        String largest = ""; //alphabetically organized last 3-letter string. 
          
          smallest = largest = s.substring(0, k);
        
  for (int i=1; i<s.length()- k+1; i++) //runs through the string and iterates only up to the number of 3-char substrings that are created. 
  {
        String sub = s.substring(i,i+k);  //partitions into substrings of k-length
    
        if (smallest.compareTo(sub) > 0)
            {smallest = sub;} // uses the compare method to make sure it stores the substring with the starting letter close to the beginning of the alphabet. The way compareTo works is that it will return a value more than 1 if it is lexicographically smaller. 
        if (largest.compareTo(sub) < 0)
            {largest = sub;} 
            // uses the compare method to make sure it stores the substring with the starting letter close to the end of the alphabet. The way compareTo works is that it will return a value less than 1 if it is lexicographically greater. 
        
    }
        return smallest + "\n" + largest;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
    