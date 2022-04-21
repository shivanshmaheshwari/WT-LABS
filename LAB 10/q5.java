import java.util.*;
public class q5{
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
        System.out.println("Enter index:");
        int ind=s.nextInt();
        s.nextLine();
        System.out.println("OUTPUT:");
        for(int i=ind;i<n;i++)
        {
            System.out.println(l.get(i));
        }
        s.close();
    }    
}