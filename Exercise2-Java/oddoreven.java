import java.util.Scanner;
public class oddoreven {
  public static void main(String[] args) {
    int x;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter a  number:");
    x=obj.nextInt();
    if (x%2==0){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
   }
 }


