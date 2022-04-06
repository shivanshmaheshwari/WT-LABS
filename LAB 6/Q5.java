
//Q5
import java.util.*;

class area {
    Scanner sc = new Scanner(System.in);
    final double pi = 3.14;
    double x;

    // square
    area(int a) {
        x = a * a;
        System.out.println("area of square is: " + x);
    }

    // triangle
    area(int a, int b) {
        x = 0.5 * a * b;
        System.out.println("area of triangle is: " + x);
    }

    // circle
    area(float c) {
        x = pi * c * c;
        System.out.println("area of circle: " + x);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side for triangle and square");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter radius of circle");
        float c = sc.nextFloat();

        area x = new area(a);
        area y = new area(a, b);
        area z = new area(c);
    }
}
