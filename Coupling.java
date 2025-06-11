import java.util.*;
class DotMatrixPrinter{
    public void print(String content){
        System.out.println("Printing with dot matrix"+content);
    }
}
class PrintManager{
    DotMatrixPrinter printer=new DotMatrixPrinter();
    public void printDocument(String content){
        printer.print(content);
    }
}
interface Printer{
    void print(String content);
}
class LaserPrinter implements Printer{
    public void print(String content){
        System.out.println("Laser Printer output: "+content);
    }
}
class InkjetPrinter implements Printer{
    public void print(String content){
        System.out.println("Inkjet Printer output: "+content);
    }
}
class PrinterManager1{
    Printer printer;
    public PrinterManager1(Printer printer){
        this.printer=printer;
    }
    public void printDocument(String content){
        printer.print(content);
    }
}
public class Coupling{
    public static void main(String[] args){
        Coupling.toughCoupling();
        Coupling.looseCoupling();

    } 
    public static void toughCoupling(){ 
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Document content : ");
        String doc=s.nextLine();
        PrintManager manger=new PrintManager();
        manger.printDocument(doc);
        s.close(); 
    }
    public static void looseCoupling(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Document content : ");
        String doc=s.nextLine();
        System.out.println("Choose Printer(1.Laser 2.Inkjet)");
        int choice=s.nextInt();
        Printer printer;
        if(choice==1){
            printer=new LaserPrinter();
        }else{
            printer=new InkjetPrinter();
        }
        PrinterManager1 manager=new PrinterManager1(printer);
        manager.printDocument(doc);
        s.close();
    }
}