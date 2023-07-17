/* Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
   Lets take 153, it is an Armstrong number because it has 3 digits and: 153 = 1^3 + 5^3 + 3^3                                                   */

java.util.*;
class ArmstrongNumber{
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter a Number");
       int n=scan.nextInt();
       int m=n;
       int sum=0;
       int remainder;
       while(n>0){
        remainder=n%10;
        n=n/10;
        sum=sum+remainder*remainder*remainder;
       }
       if(sum==m){
            System.out.println("Its a Armstrong Number");
       }
       else{
            System.out.println("Its not an Armsttrong Number");
       }
        
    }
    
}
