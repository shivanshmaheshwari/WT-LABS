//Q1
import java.util.*;
public class Q1
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        int a = num % 10;
        int b = num / 10 % 10;
        int c = num / 100;
        if (a == c && b == b) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
