import java.util.*;
public class q2
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<String>a=new ArrayList<String>();
        int n;
        System.out.println("Number of fruits you want to enter:");
        n=s.nextInt();
        s.nextLine();
        System.out.println("Enter Fruit Name:");
        for(int i=0;i<n;i++)
        { 
            String q=s.nextLine();
            a.add(q);
        }
        Iterator<String>itr=a.iterator();
        System.out.println();
        while(itr.hasNext())
        {
            String x=itr.next();
            System.out.println(x);
        }
        System.out.println("Final List:"+a);
        s.close();
    }
}