import java.util.Scanner;

//TestUSN
public class Q5 {
    public static void main(String[] args) {
        String usn;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the registration number: ");
        usn = sc.nextLine();
        if (usn.length() == 10) {
            if (usn.charAt(0) == '1' || usn.charAt(0) == '2') {
                String m = usn.substring(5, 7);
                if (m.equals("CS") || m.equals("IS") || m.equals("EC") || m.equals("ME")) {
                    if (((Character.isDigit(usn.charAt(7))) && (Character.isDigit(usn.charAt(8)))
                            && (Character.isDigit(usn.charAt(9))))) {
                        System.out.println("Success");
                    } else
                        System.out.println("Failed");
                } else
                    System.out.println("Failed");
            } else
                System.out.println("Failed");
        } else
            System.out.println("Failed");
    }

}