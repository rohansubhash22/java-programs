import java.util.Scanner;
class Booking{
    void bookTicket(){
        System.out.println("Booking a genral ticket - any mode ");
    }
}
class TrainBooking extends Booking{
    void bookTicket(){
        System.out.println("Train Ticket Booked successfully.....");
        System.out.println("Seat: 18 | coach: 02 | Cost: Rs:1000");
    }
}
class FlightBooking extends Booking{
    void bookTicket(){
        System.out.println("Flight Ticket Booked successfully.....");
        System.out.println("Seat: 12A | service:Indigo | Fare: Rs:6000");
    }
}
class cabBooking extends Booking{
    void bookTicket(){
        System.out.println("Cab Booked successfully.....");
        System.out.println("Vehicle : Sodian | Driver: Vijay | Estimated Fare: Rs:500");
    }
}
class CruiBooking extends Booking{
    void bookTicket(){
        System.out.println("Cruise sail Booked successfully.....");
        System.out.println("Cabin : Front View | Deck : 3 | Fare: Rs:11400");
    }
}
class BusBooking extends Booking{
    void bookTicket(){
        System.out.println("Bus seat Booked successfully.....");
        System.out.println("Seat: 45 | Service : \"Orange Travels\" | Number : 2352 | Cost: Rs:900");
    }
}
public class BookingSystem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Booking b;
        System.out.println("Enter the mode of the travel: ");
        System.out.println("1. Train");
        System.out.println("2. Bus");
        System.out.println("3. Flight");
        System.out.println("4. Cab");
        System.out.println("5. Cruise");
        System.out.println("Enter your choice: ");
        int n=s.nextInt();
        switch(n){
            case 1:
                b=new TrainBooking();
                break;
            case 2:
                b=new BusBooking();
                break;
            case 3: 
                b=new FlightBooking();
                break;
            case 4:
                b=new cabBooking();
                break;
            case 5:
                b=new CruiBooking();
                break;
            default:
                b= new Booking();
        }
        System.out.println("\nProcessing your Booking ..........");
        b.bookTicket();
        s.close();
    }
}