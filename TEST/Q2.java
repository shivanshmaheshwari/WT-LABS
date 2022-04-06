import java.util.Scanner;

class BankAccount {
    String acc_no;
    String name;
    double balance;

    void get(String acn, String num, double bal) {
        acc_no = acn;
        name = num;
        balance = bal;
    }

    void display() {
        System.out.println("Account number : " + acc_no + "\n" + "Name: " + name + "\n" + "Balance: " + balance + "\n");
    }
}

public class Q2 {
    public static void main(String[] args) {
        BankAccount ob[] = new BankAccount[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details of person " + (i + 1) + " :");
            System.out.print("Enter account number:");
            String acn = sc.next();
            System.out.print("Enter name:");
            String num = sc.next();
            System.out.print("Enter balance:");
            double bal = sc.nextDouble();
            ob[i] = new BankAccount();
            ob[i].get(acn, num, bal);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("\nDetails of Person " + (i + 1) + " :");
            ob[i].display();
        }
        if (ob[0].balance > ob[1].balance) {
            System.out.println("1 is having more balance than 2");
        } else {
            System.out.println("2 is having more balance than 1");
        }
    }

}