import java.util.Locale;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data;
        String data1;
        int ch;
        do {
            System.out.println("Enter 1 for case change.");
            System.out.println("Enter 2 for string reverse.");
            System.out.println("Enter 3 for compare strings.");
            System.out.println("Enter 4 to insert one string into another.");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter a string :");
                    data = sc.next();
                    System.out.println("Case changed strings are :");
                    System.out.println(data.toUpperCase());
                    System.out.println(data.toLowerCase());
                    break;
                case 2:
                    System.out.print("Enter a string :");
                    data = sc.next();
                    System.out.println("Reversed String :");
                    char[] resultarray = data.toCharArray();
                    for (int i = resultarray.length - 1; i >= 0; i--)
                        System.out.print(resultarray[i]);
                    break;
                case 3:
                    System.out.print("Enter a string :");
                    data = sc.next();
                    System.out.print("Enter another string :");
                    data1 = sc.next();
                    System.out.println(data.compareTo(data1));
                    break;
                case 4:
                    System.out.print("Enter a string :");
                    data = sc.next();
                    System.out.print("Enter another string :");
                    data1 = sc.next();
                    System.out.println(data.concat(data1));
                    break;
                default:
                    System.out.println("Enter valid choice.");
                    break;
            }
            System.out.println("Do you want to continue? Press 1 for yes and 2 for no");
            ch = sc.nextInt();
        } while (ch == 1);
    }
}