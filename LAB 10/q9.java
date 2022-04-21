import java.util.*;
public class q9 {
    public static void main(String[] args) {
        PriorityQueue<Integer>q=new PriorityQueue<Integer>();
        for(int i=0;i<5;i++)
        {
            q.add(i+1);
        }
        System.out.println(q);
        String x=q.toString();
        System.out.println(x);
    }
}