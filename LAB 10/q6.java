import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList<Integer>l=new LinkedList<Integer>();
        System.out.println("Enter N:");
        int n=s.nextInt();
        s.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter number:");
            int x=s.nextInt();
            s.nextLine();
            l.add(x);
        }
        System.out.println("INITIAL LIST:"+l);
        Collections.shuffle(l);
        System.out.println("FINAL LIST:"+l);
        s.close();
    }    
}