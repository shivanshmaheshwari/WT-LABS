import java.util.*;
public class Q7{
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
	    int n=sc.nextInt();
	    int sum=0,digit;
		for(;n>0;n=n/10){
		    digit = n%10;
		    sum += digit;
	    }
	    System.out.println(sum);
    }
}
