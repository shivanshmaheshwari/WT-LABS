import java.util.Scanner;

public class Q2 {
 public static void main(String[] args) {
    String n1,n2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String 1: ");
    n1=sc.next();
    System.out.println("Enter String 2: ");
    n2=sc.next();
    String n3="";
    n3=n1.concat(n2);
    System.out.println("Concatenated String : "+n3);
    String s1="",s2="",s3="",s4="";
    int pt=n3.length()/4;
    s1=n3.substring(0,pt);
    s2=n3.substring(pt,2*pt);
    s3=n3.substring(2*pt,3*pt);
    s4=n3.substring(3*pt,n3.length());
    System.out.println("String divided into 4 substrings : ");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
 }   
}