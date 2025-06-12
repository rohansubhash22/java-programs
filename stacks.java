import java.util.*;
public class stacks{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Stack<String> books=new Stack<>();
        System.out.println("Enter the no of books: ");
        int n=s.nextInt();
        s.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Enter book "+(i+1)+": ");
            books.push(s.nextLine());
        }
        System.out.println("Books in stack,top->bottom"+books);
        if(!books.isEmpty()){
            System.out.println("Top book: "+books.peek());
            System.out.println("Removing book: "+books.pop());
        }
        System.out.println("Stack after pop: "+books);
        s.close();
    }
    
}