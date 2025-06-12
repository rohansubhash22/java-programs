import java.util.*;
public class HashMap1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        HashMap<String, Integer> priceMap=new HashMap<>();
        System.out.print("No of products: ");
        int n=s.nextInt();
        s.nextLine();
        for(int i=0;i<n;i++){
            System.err.println("Enter product Name: ");
            String product=s.nextLine();
            System.out.println("Enter the price of "+product);
            int price=s.nextInt();
            s.nextLine();
            priceMap.put(product, price);
        }
        System.out.println("\n Product Price list ");
        for(Map.Entry<String ,Integer> entry:priceMap.entrySet()){
            System.out.println(entry.getKey()+"=> Rs "+entry.getValue());
        }
        System.out.println("Enter the  Searching product name: ");
        String rname=s.nextLine();
        if(priceMap.containsKey(rname)){
            System.out.println("Price of "+ rname+" is Rs: "+priceMap.get(rname));
        }
        else{
            System.out.println("Product not found");
        }
        //removal of items
        System.out.println("Enter the product to remove :");
        String removeProduct=s.nextLine();
        if(priceMap.remove(removeProduct) != null){
            System.out.println(removeProduct+" removed");            
        }
        else{
            System.out.println("Product not Found");
        }
        System.out.println("Updated product price list : ");
        for(Map.Entry<String ,Integer> entry:priceMap.entrySet()){
            System.out.println(entry.getKey()+"=> Rs "+entry.getValue());
        }
        s.close();
    }
}