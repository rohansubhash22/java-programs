import java.util.*;
public class Throw {
    static void checkAge(int age){
        if(age<22){
            throw new ArithmeticException("Access Denied- age proxy is +22");
        }
        else{
            System.out.println("Accesss granted");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int num=sc.nextInt();
        try{
            checkAge(num);
        }
        catch(ArithmeticException e){
            System.out.println("Exception: "+e.getMessage());
        }
        finally{
            sc.close();
        }
    }  
}