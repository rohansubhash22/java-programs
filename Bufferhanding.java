import java.io.*;
import java.io.IOException;
import java.io.FileReader;
public class Bufferhanding{
    public static void main(String[] args){
        try(BufferedReader reader=new BufferedReader(new FileReader("abc.text"))){
            String line;
            System.out.print("Reading file content : ");
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Caugth IOException: "+e.getMessage());
        }
    }
}