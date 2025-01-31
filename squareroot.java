import java.util.*;
public class squareroot {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    try{
        if(n<0){
            throw new ArithmeticException("Cannot calculate square root of negative number");
        }
        double sqrt = Math.sqrt(n);
   
        System.out.println("Square root of " + n + " is " + sqrt);
    }
    catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage()); 
    }
 }   
}
