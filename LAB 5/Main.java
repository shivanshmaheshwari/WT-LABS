import java.util.Scanner;

class Box{
    Scanner sc= new Scanner(System.in);
  int lenght,width,height;
  void inputData(){
      Scanner sc = new Scanner((System.in));
      System.out.println("Enter lenght:");
      lenght=sc.nextInt();
      System.out.println("Enter width:");
      width=sc.nextInt();
      System.out.println("Enter height:");
      height=sc.nextInt();
    }
    void volume(){
      int volume = (lenght*width*height);
      System.out.println(volume);
  }

}
public class Main {

    public static void main(String[] args) {
       Box x = new Box();
       x.inputData();
       x.volume();
    }
}

