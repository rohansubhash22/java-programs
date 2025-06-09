import java.util.*;
// complie-time method (overloading)
class MathOperations {
    int add(int a,int b){
        return a+b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
//method overriding (runtime)
class Operation{
    void calculate(int n){
        System.out.println("General operation "+n);
    }   
}
class Power extends Operation {
    void calculate(int n) {
        System.out.println("Square of  "+n+" is: "+ (n * n));
    }
}
class Factorial extends Operation {
    void calculate(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        // polymorphism.overloading();
        polymorphism.overriding();
    }
    public static void overloading(){
        MathOperations ma = new MathOperations();
        System.out.println("Sum of 2 integers: " + ma.add(2, 4));
        System.out.println("Sum of 2 doubles: " + ma.add(2.2, 4.2));
        System.out.println("Sum of 3 integers: " + ma.add(5, 10, 15)); 
    
    }
    public static void overriding(){
        Scanner s=new Scanner(System.in);
        Operation op;
        System.out.print("Enter a number for general operation: ");
        int num = s.nextInt();
        op = new Power();
        op.calculate(num);
        op = new Factorial();
        op.calculate(num);
        s.close();
    }
}