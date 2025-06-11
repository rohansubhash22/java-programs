import java.util.*;
interface Basicoperation{
    void add(double a,double b);
}

interface Advanceoperation extends Basicoperation{
    void multipy(double a,double b);
}
class Calculator implements Advanceoperation{
    double a;
    double b;
    public void add(double a,double b){
        System.out.println("Addition of the two numbers is: "+(a+b));
    }
    public void multipy(double a,double b){
        System.out.println("Multiplcation of two numbers is: "+(a*b));
    }
}
public class extendinginterface {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first element: ");
        double a=s.nextDouble();
        System.out.println("Enter the Second element: ");
        double b=s.nextDouble();
        Calculator c=new Calculator();
        c.add(a,b);
        c.multipy(a, b);
        s.close();
    }
    
}
