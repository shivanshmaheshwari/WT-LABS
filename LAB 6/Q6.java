//q6
import java.util.*;

class rectangle{
    int area,perimeter;
    rectangle(int len,int bre){
        area = len*bre;
        perimeter = 2*(len*bre);

        System.out.println("area of rectangle " + area);
        System.out.println("perimeter of rectangle " + perimeter);
    }
}
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length and breath");
        int len = sc.nextInt();
        int bre = sc.nextInt();
        rectangle x = new rectangle(len,bre);
    }
}
