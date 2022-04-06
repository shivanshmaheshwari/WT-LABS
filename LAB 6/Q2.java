// Q2
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total numbers: ");
        int n = sc.nextInt();
        int number;
        int even_count = 0, odd_count = 0;
        for(int i=1;i<=n;i++) {
            number  = sc.nextInt();
            if(number%2 ==0){
                even_count++;
            }
            else odd_count++;
        }
        System.out.println("even count: "+even_count);
        System.out.println("odd count: "+odd_count);
    }
}
