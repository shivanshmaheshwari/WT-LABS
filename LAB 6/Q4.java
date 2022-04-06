// Q4 
import java.util.*;

class subtract{
    Scanner sc = new Scanner(System.in);
    int a,b,c,x;
    subtract(int a, int b){
        if(a>b) x = a-b;
        else x=b-a;
        System.out.println("subtraction fo two numbers:"+x);
    }
    subtract(int a, int b,int c){
        x = a-b-c;
        System.out.println("subtraction of three numbers:"+x);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        subtract x = new subtract(a,b);
        subtract y = new subtract(a,b,c);
    }
    
}
