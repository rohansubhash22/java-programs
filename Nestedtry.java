import java.util.*;
public class Nestedtry {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         try{
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            try{
                int[] arr=new int[5];
                System.out.println("Acessing array element: "+arr[2]);
                try{
                    int result=100/num;
                    System.out.println("Result: "+result);
                }catch(ArithmeticException e){
                    System.out.println("Inner catch: "+e.getMessage());
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Middle Catch: "+e.getMessage());
            }

         }catch(Exception e){
            System.out.println("Outer Catch: Invalid Input Enter number Please"+e.getMessage());
         }
         System.out.println("Program Ended");
         sc.close();
    }
    
}