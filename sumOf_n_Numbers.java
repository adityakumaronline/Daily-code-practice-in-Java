import java.util.*;
class Array{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number till you want to find the sum.");
    int num=sc.nextInt();
    int sum=0;
    for(int i=1; i<=num; i++){
      sum=sum+i;
    }
    System.out.println("The total sum is "+sum);
  }
}
