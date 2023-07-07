import java.util.*;
class IfElse{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    if(age>=18){
      System.out.println("Eligible for drive.");
    }
    else {
      System.out.println("Not eligible for drive.");
    }
  }
}
