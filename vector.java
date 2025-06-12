import java.util.*;
public class vector{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Vector<Integer> numbers=new Vector<>();
        System.out.println("How many numbers do you want to enter: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter Number"+(i+1)+" : ");
            numbers.add(s.nextInt());
        }
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        double average=(n>0)? (double) sum/n:0;
        System.out.println("\n Numbers entered : "+ numbers);
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
        s.close();
    }
}