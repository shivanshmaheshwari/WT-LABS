import java.util.*;
public class Q8{
    public static void main(String[] args) {
        Scanner scan = null;
        int num = 0;
        scan = new Scanner(System.in);
        System.out.print("Enter an Integer:: ");
        num = scan.nextInt();
        System.out.println("Unique digits = " + countUniqueDigits(num));
        scan.close();
    }
  
    public static int countUniqueDigits(int num) {
        Set<Integer> digits = new HashSet<Integer>();
        while(num > 0) {

           digits.add(num % 10);
           num /= 10;
        }
        return digits.size();
    }
  
    
}
