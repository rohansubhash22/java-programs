import java.util.*;
@FunctionalInterface
interface Hi{
    void sayhello(String name);
}
public class FunctionInterface{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=s.nextLine();
        Hi greeting=(n)->System.out.println("Hello, "+n+" Good morning");
        greeting.sayhello(name);
        s.close();
    }
}