import java.util.*;
class getAlpha{
    void getNum(String ch)
    {
        for(int i = 0; i < ch.length(); i++) {
        switch (ch.charAt(i)) {
            case '0':
                System.out.print("Zero");
                break;
            case '1':
                System.out.print(" One");
                break;
            case '2':
                System.out.print(" Two");
                break;
            case '3':
                System.out.print(" Three");
                break;
            case '4':
                System.out.print(" Four");
                break;
            case '5':
                System.out.print(" Five");
                break;
            case '6':
                System.out.print(" Six");
                break;
            case '7':
                System.out.print(" Seven");
                break;
            case '8':
                System.out.print(" Eight");
                break;
            case '9':
                System.out.print(" Nine");
                break;
            
            default:
                break;
        }
        }
    }
}
class Q9{

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        System.out.println(a);
        getAlpha ga = new getAlpha();
        ga.getNum(Integer.toString(a));
    }
}