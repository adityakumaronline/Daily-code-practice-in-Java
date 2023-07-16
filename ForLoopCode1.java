import java.util.*;
class Table{
  public static void main(String[] args) {
    Scanner scannerObject=new Scanner(System.in);
    int n=scannerObject.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(n+" X "+i+"="+ n*i);
    }
  }
}
