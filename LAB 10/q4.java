import java.util.*;
public class q4
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer>a=new ArrayList<Integer>();
        int n;
        System.out.println("Number of elements you want to enter:");
        n=s.nextInt();
        s.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a number:");
            int x=s.nextInt();
            s.nextLine();
            a.add(x);
        }
        Collections.sort(a);
        System.out.println("OUTPUT:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a.get(i));
        }
        s.close();
    }
}