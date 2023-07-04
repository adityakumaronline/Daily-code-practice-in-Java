//Find factorial of a given number.
import java.util.*;
class findFactorial{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    int factorial=1;
    for(int i=1;i<=n;i++){
       factorial=factorial*i;
    }
    System.out.println("The factorial of the given number is "+ factorial);
  }
}
