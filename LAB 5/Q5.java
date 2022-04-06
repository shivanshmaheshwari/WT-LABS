import java.util.*;
public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=90){
		    System.out.println("O grade");
		}
		else if(n>=80 && n<90){
		    System.out.println("E GRADE");
		}
		else if(n>=70 && n<80){
		    System.out.println("A GRADE");
		}
		else if(n>=60 && n<70){
		    System.out.println("B GRADE");
		}
		else if(n>=60 && n<50){
		    System.out.println("E GRADE");
		}
		else{
		    System.out.println("FAIL");
		}
    }
}
