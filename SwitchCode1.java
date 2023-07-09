import java.util.*;
class SwitchCodeOne{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Menu: 1. add, 2. sub, 3. mul, 4. div");
    System.out.println("Enter first numeber: ");
    int firstNum=sc.nextInt();
    System.out.println("Enter second number: ");
    int secondNum=sc.nextInt();
    System.out.println("Enter the operation you want to perform: ");
    int operation=sc.nextInt();
    switch (operation){
      case 1: 
        System.out.println(firstNum+secondNum);      
        break;
      case 2:
        System.out.println(firstNum-secondNum);
        break;
      case 3:
        System.out.println(firstNum*secondNum);
        break;
      case 4:
        System.out.println(firstNum/secondNum);
        break;
      default: 
        System.out.println("Invalid input.");
        break;
    }
  }
}
