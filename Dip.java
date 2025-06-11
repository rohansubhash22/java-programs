import java.util.*;
interface MathOperation{
    int operate(int a, int b);
}
class Addition implements MathOperation {
    public int operate(int a, int b) {
        return a + b;
    }
}
class Multiplcation implements MathOperation{
    public int operate(int a, int b) {
        return a * b;
    }
}
class calculator{
    private MathOperation operation;

    public calculator(MathOperation operation) {
        this.operation = operation;
    }

    public void calculateAndDisplay(int a,int b){
        int result=operation.operate(a,b);
        System.out.println("Result: " + result);

    }
}
public class Dip{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");  
        int num1=s.nextInt();
        System.out.println("Enter Second number: ");
        int num2=s.nextInt();
        System.out.println("Choose operation: 1.Add, 2.Multiply");
        int choice=s.nextInt();
        MathOperation operation;
        if(choice==1){
            operation=new Addition();
        }
        else{
            operation=new Multiplcation();
        }
        calculator c =new calculator(operation);
        c.calculateAndDisplay(num1,num2);
        s.close();
    }
}