
//Q1
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = (a > b) ? a : b;
        int y = (x > c) ? x : c;

        System.out.println("Max: " + y);
    }
}