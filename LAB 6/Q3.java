
// Q3
import java.util.*;

class Volume {
    Scanner sc = new Scanner(System.in);
    int length, breadth, height;

    void box() {
        System.out.println("enter lenght breadth height");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
    }

    void demo() {
        int volume;
        volume = length * breadth * height;
        System.out.println("volume of cube is: " + volume);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Volume x = new Volume();
        x.box();
        x.demo();
    }
}
