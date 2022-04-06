import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String name1;
        String name2;
        String ns1 = "";
        String ns2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full name 1: ");
        name1 = sc.nextLine();
        System.out.println("Enter the full name 2: ");
        name2 = sc.nextLine();
        int p1 = name1.lastIndexOf(' ');
        int p2 = name2.lastIndexOf(' ');
        ns1 = name1.substring(0, p1) + name2.substring(p2, name2.length());
        ns2 = name2.substring(0, p2) + name1.substring(p1, name1.length());
        System.out.println("New names are : ");
        System.out.println(ns1);
        System.out.println(ns2);
    }
}