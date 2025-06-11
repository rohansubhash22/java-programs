import java.util.*;
public class exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            System.out.println("Enter a number:");
            int num1 = sc.nextInt();
            int result = num / num1;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e) {
            System.out.println("Caught Exception : Division by zero");
        }
        finally {
            System.out.println("This block of code is always executed");
            sc.close();
        }
    }
} 