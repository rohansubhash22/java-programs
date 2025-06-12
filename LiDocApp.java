import java.util.*;
class LiDocApp{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        LinkedList<String> waitingList=new LinkedList<>();
        while(true){
            System.out.println("\n=====Doctor's Appointement System=====");
            System.out.println("1.Add Patient");
            System.out.println("2.Served Patient");
            System.out.println("3.View WaitingList");
            System.out.println("4.Exit");
            System.out.println("Enter your chioce: ");
            int chioce =s.nextInt();
            switch(chioce){
                case 1:
                System.out.println("Enter patient name: ");
                s.nextLine();
                String name=s.nextLine();
                waitingList.addLast(name);
                System.out.println(name+" is added to the waiting list");
                break;
                case 2:
                if(!waitingList.isEmpty()){
                    String Served=waitingList.removeFirst();
                    System.out.println(Served+", has been visited by doctor");
                }else{
                    System.out.println("No patients in the Queue");
                }
                break;
                case 3:
                System.out.println("Current waiting list:"+waitingList);
                break;
                case 4:
                System.out.println("Existing System. thank you");
                s.close();
                return;
                default:
                System.out.println("Invalid choice ");
            }
        }

    }
}