import java.util.*;
import java.math.*;

class volume{
    Scanner sc = new Scanner(System.in);
    int length,breadth,height,radius;
    final int pi = (int)3.14;
    
    volume(int lenght){
        this.length = lenght;
        int vol = (int)Math.pow(lenght,3);
        System.out.println("volume of square is: " + vol);
    }
    volume(int length,int radius){
        this.length = length;
        this.radius = radius;
        int vol = (int)(pi * length * Math.pow(radius,2));
        System.out.println("volume of cyliner is: " + vol);
    }
    volume(int length,int breadth,int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        int vol = length*breadth*height;
        System.out.println("volume of rectangle is: " + vol);
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter value of lenght: ");
        int length = sc.nextInt();
        System.out.println("enter value of breadth: ");
        int breadth = sc.nextInt();
        System.out.println("enter value of height: ");
        int height = sc.nextInt();
        System.out.println("enter value of redius: ");
        int radius = sc.nextInt();

        volume x = new volume(length);
        volume y = new volume(length,radius);
        volume z = new volume(length,breadth,height);
    }  
}
