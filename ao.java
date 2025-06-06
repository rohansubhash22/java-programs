import java.util.*; 
class ArithmeticOperations{ 
    void perform(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Sum is: "+(a+b));
        System.out.println("Subtraction is: "+(a-b));
        System.out.println("Product is: "+(a*b));
        System.out.println("Quotient is: "+(a/b));
        s.close();
    }
    
}
public class ao{
    public static void main(String[] args) {
        ArithmeticOperations obj = new ArithmeticOperations();
        obj.perform();
    }
}