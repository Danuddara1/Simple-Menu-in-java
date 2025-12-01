public class Ticket {
    private int number;
    public String name;
    private String email;
    private static final String date = "2025.11.20";  
    private int seatNumber;

    private static int seatCounter = 1; 

     public Ticket(String name, String email) {
        this.number = seatCounter;
        this.name = name;
        this.email = email;
        this.seatNumber = seatCounter++; 
    }

     public void printTicket() {
        System.out.println("----- Ticket Details -----");
        System.out.println("Ticket Number: " + number);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Date: " + date);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("--------------------------");
    }
    public String getPrintTicket() {
        return "----- Ticket Details ----- \n Ticket Number: " + number+"\n";
        
    }
    public double price(){
        return 400.50;
    }

    public Ticket getTicket(){  // 32@safpweh234dll;
        return this;
    }
    // void ???

}



// System.out.println("----- Ticket Details -----");
        // System.out.println("Ticket Number: " + number);
        // System.out.println("Name: " + name);
        // System.out.println("Email: " + email);
        // System.out.println("Date: " + date);
        // System.out.println("Seat Number: " + seatNumber);
        // System.out.println("--------------------------");