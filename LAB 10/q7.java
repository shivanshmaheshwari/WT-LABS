import java.util.*;
public class q7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        HashSet<Integer>h=new HashSet<Integer>();
        for(int i=1;i<=5;i++)
        {
            h.add(i);
        }
        System.out.println("SET 1 INITIAL CONTENT:"+h);
        HashSet<Integer>p=new HashSet<Integer>();
        for(int i=3;i<=7;i++)
        {
            p.add(i);
        }
        System.out.println("SET 2 INITIAL CONTENT:"+p);
        h.retainAll(p);
        System.out.println("FINAL SET:"+h);
        s.close();
    }
}