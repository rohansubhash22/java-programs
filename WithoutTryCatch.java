import java.util.Scanner;
public class WithoutTryCatch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num <0){
            throw new ArithmeticException("Negative number not allowed");
        }
        else{
            System.out.println("You entered number is : " + num);
        }
        sc.close();
    }
}