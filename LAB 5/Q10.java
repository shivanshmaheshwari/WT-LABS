
import java.util.*;
import java.math.*;
class Q10{
    static void Digits(int n)
    {
    	int largest = 0;
    	int smallest = 9;

    	while(n != 0)
    	{
    		int r = n % 10;
    		largest = Math.max(r, largest);
    		smallest = Math.min(r, smallest);
    		n = n / 10;
    	}
    System.out.println(largest + " " + smallest);
    }
    public static void main (String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
    	int n = sc.nextInt();
    	Digits(n);

    }
}
