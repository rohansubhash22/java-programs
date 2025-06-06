import java.util.*;
class SuperFactorial{
    int Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    long clacFact(int n){
        long sf=1;
        for(int i=1;i<=n;i++){
            sf *= Factorial(i);
        }
        return sf;
    }
}
public class SuperFact {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        SuperFactorial obj = new SuperFactorial();
        long  result = obj.clacFact(n);
        System.out.println("Super Factorial of " + n + " is: " + result);
        s.close();
    }
    
}
