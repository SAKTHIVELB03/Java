/*
Zoho Long Coding Question: Taxi Booking Application

Description: Design a taxi booking application where customers can book taxis available at certain points in a linear
route.

Problem Assumption:
Taxi Count: Assume 4 taxis for simplicity, but it should scale to any number of taxis.
Point on Route: A,B,C,D,E,F (each 15km apart)
Travel time Between Points: 60 mins

Charges:
Minimum of Rs:100 for the first 5km
Rs 100 per kn thereafter
Initial Taxis Position: All taxis are stationed at A

Booking rules:
when a customer books a taxi:
A free taxi at the point of pickup point is allocated.
If no free taxi is available, the nearest taxi is allocated.
If two taxis are free at the same point, the one with lowest earning is allocated.
Taxis only charge from the pickup point to drop point.
If no taxi is available, the booking is rejected.

Sample input and output:

Input-1:
Customer ID: 1
Pickup Point: A
Drop Point: B
PickUp Time: 9

Output-1:
Taxi can be allocated
Taxi-1 is allotted.

Input-2:
Customer ID: 2
Pickup Point: B
Drop Point: D
PickUp Time: 9

Output-2:
Taxi can be allocated
Taxi-2 is allotted.

Input-3:
Customer ID: 3
Pickup Point: B
Drop Point: C
PickUp Time: 12

Output-3:
Taxi can be allocated
Taxi-1 is allotted.

Display Taxi Details:
Taxi-1 Total Earnings: Rs: 400
Booking ID  Customer ID  From  TO  PickupTime  DropTime  Amount
   1            1          A   B      9           10      200
   3            3          B   C      12          13      200

Taxi-2 Total Earnings: Rs: 350
Booking ID  Customer ID  From  TO  PickupTime  DropTime  Amount
   2            2          B   D      9           11      350

*/

import java.util.ArrayList;
import java.util.List;

class Customer {
    private int customerId;
    private char pickup;
    private char drop;
    private int pickTime;

    Customer(int id, char pickup , char drop , int pTime){
        this.customerId = id;
        this.pickup = pickup;
        this.drop = drop;
        this.pickTime = pTime;
    }

    public int getCustomerId() {
        return customerId;
    }

    public char getPickup() {
        return pickup;
    }

    public char getDrop() {
        return drop;
    }

    public int getPickTime() {
        return pickTime;
    }
}

class Booking{
    private int bookingId;
    private int dropTime;
    private int amount;
    private Customer customer;

    Booking(int id, int dropTime, int amount, Customer customer){
        this.bookingId = id;
        this.dropTime = dropTime;
        this.amount = amount;
        this.customer = customer;
    }

    public int getBookingId() {
        return bookingId;
    }

    public int getDropTime() {
        return dropTime;
    }

    public int getAmount() {
        return amount;
    }

    public Customer getCustomer() {
        return customer;
    }
}

class Taxi {

    private int taxiId;
    private char currentSpot;
    private int freeTime;
    private int earnings;
    private List<Booking> bookings;

    Taxi(int id){
        this.taxiId = id;
        this.currentSpot = 'A';
        this.freeTime = 0;
        this.earnings = 0;
        bookings = new ArrayList<>();
    }

    public boolean isFree(char pickup, int pickupTime){
        int travelTime = Math.abs(pickup - currentSpot);
        return freeTime + travelTime <= pickupTime;
    }

    public void assignBookings(Booking b){
        bookings.add(b);
    }

    public int getTaxiId(){
        return taxiId;
    }

    public char getCurrentSpot(){
        return currentSpot;
    }

    public int getFreeTime(){
        return freeTime;
    }

    public int getEarnings(){
        return earnings;
    }

    public List<Booking> getBookings(){
        return bookings;
    }

    public void setFreeTime(int freeTime){
        this.freeTime = freeTime;
    }

    public void setEarnings(int earnings){
        this.earnings = earnings;
    }

    public void setCurrentSpot(char s){
        this.currentSpot = s;
    }
}

class BookingSystem {
    private List<Taxi> taxis;
    int bookingId = 1;

    BookingSystem(int taxiCount){
        taxis = new ArrayList<>();
        for(int i=1; i<=taxiCount; i++){
            taxis.add(new Taxi(i));
        }
    }

    private int calculateCharges(char pickup, char drop){
        int distance = Math.abs(pickup - drop) * 15;
        int charges = 100;
        distance -= 5;
        charges += distance * 10;
        return charges;
    }

    Taxi findTaxi(char pickup, int pickupTime){
        List<Taxi> freeTaxis = new ArrayList<>();

        for(Taxi t : taxis){
            if(t.isFree(pickup, pickupTime)){
                freeTaxis.add(t);
            }
        }

        if(freeTaxis.isEmpty())
            return null;

        int minDistance = Integer.MAX_VALUE;

        for(Taxi t : freeTaxis){
            int distance = Math.abs(pickup - t.getCurrentSpot());
            if(distance < minDistance)
                minDistance = distance;
        }

        List<Taxi> closest = new ArrayList<>();

        for(Taxi t : freeTaxis){
            int distance = Math.abs(pickup - t.getCurrentSpot());
            if(distance == minDistance)
                closest.add(t);
        }

        Taxi selected = closest.get(0);

        for(Taxi t : closest){
            if(t.getEarnings() < selected.getEarnings()){
                selected = t;
            }
        }

        return selected;
    }

    void bookTaxi(Customer c){
        Taxi selected = findTaxi(c.getPickup(), c.getPickTime());

        if(selected == null){
            System.out.println("No Taxi is Available");
            return;
        }

        int travelTime = Math.abs(c.getPickup() - c.getDrop());
        int dropTime = c.getPickTime() + travelTime;
        int charges = calculateCharges(c.getPickup(), c.getDrop());

        Booking booking = new Booking(bookingId, dropTime, charges, c);
        bookingId++;

        selected.assignBookings(booking);
        selected.setFreeTime(dropTime);
        selected.setEarnings(selected.getEarnings() + charges);
        selected.setCurrentSpot(c.getDrop());

        System.out.println("Taxi-" + selected.getTaxiId() + " is allocated");
    }

    void displayTaxi(){
        System.out.println();
        System.out.println();

        for(Taxi t : taxis){
            System.out.println("Taxi-" + t.getTaxiId() + " Earnings: " + t.getEarnings());
            System.out.println("Booking Id\tCustomer Id\tFrom\tTo\tPickup Time\tDrop Time\tCharges");

            for(Booking b : t.getBookings()){
                System.out.println(
                        b.getBookingId() + "\t\t" +
                                b.getCustomer().getCustomerId() + "\t\t" +
                                b.getCustomer().getPickup() + "\t\t" +
                                b.getCustomer().getDrop() + "\t\t" +
                                b.getCustomer().getPickTime() + "\t\t" +
                                b.getDropTime() + "\t\t" +
                                b.getAmount()
                );
            }

            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(1,'A','B',9);
        Customer c2 = new Customer(2,'B','D',9);
        Customer c3 = new Customer(3,'B','C',12);

        BookingSystem bookingSystem = new BookingSystem(4);

        bookingSystem.bookTaxi(c1);
        bookingSystem.bookTaxi(c2);
        bookingSystem.bookTaxi(c3);


        bookingSystem.displayTaxi();
    }
}
