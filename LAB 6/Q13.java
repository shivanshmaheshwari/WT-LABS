import java.util.*;

class Area {
    int length, breadth;

    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        int area = length * breadth;
        System.out.println("Area " + area);
    }
}

class Volume extends Area {
    int height;

    Volume(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
        int volume = length * breadth * height;
        System.out.println("volume " + volume);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length breath and height");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int height = sc.nextInt();
        Volume x = new Volume(length, breadth, height);
    }
}