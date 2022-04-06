import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String name;
        String sub;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the full name: ");
        name=sc.nextLine();
        System.out.println("Enter the substring to be added: ");
        sub=sc.next();
        int pos=name.indexOf(' ');
        String n="";
        n=name.substring(0,pos)+" "+sub+name.substring(pos,name.length());
        System.out.println(n);
    }
   
    
}