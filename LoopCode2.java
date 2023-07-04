//Find sum of n natural numbers.
import java.util.*;
class SumOfNum{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for (int i=1;i<=n;i++){
      sum=sum+i;
      
    }System.out.println(sum);
  }
}
