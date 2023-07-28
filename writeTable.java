import java.util.*;
class Array{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number, which you want to display multiplication table:");
    int num=sc.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(num+" x "+i+" = "+num*i);
    }
  }
}
