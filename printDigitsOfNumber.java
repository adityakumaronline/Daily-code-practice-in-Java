import java.util.*;
class PrintDigitsOfNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int remainder;
        while(num>0){
            remainder=num%10;
            num=num/10;
            System.out.println(remainder);
        }
    }
}
