import java.util.*;
public class StringprintInpattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String n=s.nextLine();
        n=n.toUpperCase().trim();
        StringprintInpattern.print(n);
        s.close();
    }
    public static void print(String n){
        int size=5;
        System.out.println();
        for(char c:n.toCharArray()){
            if(c=='A'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1|| i==(size/2)+1 || j==size||i==1 ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
            System.out.println();
            }
            }
            if(c==' '|| c=='.'){
                System.out.println("");
                System.out.println("");
            }
            if(c=='B'){
                for (int i = 0; i < size; i++)
                {
                    for (int j = 0; j < size; j++)
                    {
                        if ((i == 0 || j==0|| i == size - 1 || i == size/2) && j < (size - 2))
                            System.out.printf("# ");
                        else if (j == (size - 2)&& !(i == 0 || i == size - 1|| i == size/2))
                            System.out.printf("# ");
                        else
                            System.out.printf("  ");
                    }
                    System.out.printf("\n");
                }
            }
            if(c=='C'){
                
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1|| i==1 || i==size ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	        }
                
            }
            if(c=='D'){
                int i, j;
    for (i = 0; i < size; i++) 
    {
        System.out.printf("# ");
        for (j = 0; j < size; j++) 
        {
            if ((i == 0 || i == size - 1)
                && j < size - 1)
                System.out.printf("# ");
            else if (j == size - 1 && i != 0 && i != size - 1)
                System.out.printf("# ");
            else
                System.out.printf("  ");
        }
        System.out.printf("\n");
    }
                
            }
            if(c=='E'){
                
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1|| i==1 || i==size|| i==(size/2)+1){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	        }
                
            }
            if(c=='F'){
                
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1|| i==1 || i==size/2+1 ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	        }
                
            }
            if(c=='G'){
                int i, j,d=size;
    d--;
    for (i = 0; i < size; i++) 
    {
        for (j = 0; j < d; j++)
        {
            if ((i == 0 || i == size - 1) && (j == 0 || j == d))
                System.out.printf("  ");
            else if (i == size/2)
                System.out.printf("# ");
            else if (j == 0)
                System.out.printf("# ");
            else if (i == 0 && j <= size)
                System.out.printf("# ");
            else if (i == size / 2  && j > size / 2)
                System.out.printf("# ");
            else if (i > size / 2 && j == d - 1)
                System.out.printf("# ");
            else if (i == size - 1 && j < d)
                System.out.printf("# ");
            else
                System.out.printf("  ");
        }
        System.out.printf("\n");
    }
                
            }
            if(c=='H'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1|| i==(size/2)+1 || j==size ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
            if(c=='I'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(i==1|| j==(size/2)+1 || i==size ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
            if(c=='J'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==(size/2)+1 || i==size && j<(size/2)+1||i==1 ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
            }
            if(c=='K'){
                int i, j, half = size / 2, dummy = half;
    for (i = 0; i < size; i++)
    {
        System.out.printf("# ");
        for (j = 0; j <= half; j++)
        {
            if (j == -(dummy))
                System.out.printf("# ");
            else if(j==(dummy))
                System.out.printf("# ");
            else
                System.out.printf("  ");
        }
        System.out.printf("\n");
        dummy--;
    }
                
            }
            if(c=='L'){
                
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1|| i==size ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
            if(c=='M'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1||i==j && i<=size/2 || i+j==size+1 && i<=size/2+1 || j==size){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
            if(c=='N'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1|| i==j || j==size ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
            if(c=='O'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1 || j==size||i==size||i==1 ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
            if(c=='P'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1|| i==1 || j==size && i<size/2+1 || i==size/2+1 ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
            if(c=='Q'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1 || j==size||i==size||i==1  ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }      
    int i, j, d = size;
    for (i = 0; i < size / 2; i++)
    {
        for (j = 0; j <= d; j++) 
        {
            if (j == d)
                System.out.printf("#");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
        d++;
    }
                
            }
            if(c=='R'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(i==1 ||j==1||(i==j && i>(size/2))||((i+j)==(size+1) && i<=(size/2) )||(i==((size/2)+1) && j<=(size/2))){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
            if(c=='S'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1 && i<=size/2 || i==1||i==size || i==size/2+1|| j==size && i>size/2 ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
            if(c=='T'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(i==1|| j==size/2+1){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
            if(c=='U'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1||j==size|| i==size){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
            if(c=='V'){
                
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(i+j==size+1&& i<=(size/2)+1 || i==j && i<=(size/2)+1 ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
            if(c=='W'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(j==1||i==j && i>size/2 || i+j==size+1 && i>size/2 || j==size){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
            if(c=='Y'){
                int counter=0;
                for (int i = 0; i < size; i++)
                {
                    for (int j = 0; j <= size; j++)
                    {
                        if (j == counter || j == size - counter && i <= size / 2)
                            System.out.printf("# ");
                        else
                            System.out.printf("  ");
                    }
                    System.out.printf("\n");
                    if (i < size / 2)
                        counter++;
                }
                
            }
            if(c=='X'){
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(i+j==size+1 || i==j ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
            }
            if(c=='Z'){
                
                for(int i=1;i<=size;i++){
	        for(int j=1;j<=size;j++){
	            if(i==1|| i+j==size+1 || i==size ){
	            System.out.print("# ");}
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
                
            }
        System.out.println();

        }
    }
}