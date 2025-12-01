import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleMenu {
    static Customer[] customers = new Customer[5];
    static Ticket[] tickets = new Ticket [5];
    static int ticketCount = 0;
    static int customerCount = 0;
    static Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) {
        while(true){
        System.out.println("Welcome to the Ticket Booking System!");
        System.out.println("-------------------------------------");
        System.err.println("Do you already have an account?  press y to continue or any other key to create an account");
        String haveAccount = scanner.nextLine();
            if(haveAccount.equals("y")){
                System.out.println("Welcome back! Please log in to continue.");
            }else{
                System.out.println("Create your account:");
                System.out.print("Enter your name: ");
                String cname = scanner.nextLine();

                System.out.print("Enter your email: ");
                String cemail = scanner.nextLine();

                System.out.println("Create your Username: ");
                String cusername = scanner.nextLine();

                System.out.print("Create your password: ");
                String cpassword = scanner.nextLine();


                System.out.print("Enter your phone number: ");
                String cphoneNumber = scanner.nextLine();

                
                Customer Customers = new Customer(cname, cemail, cusername ,cpassword ,cphoneNumber);
                System.out.println("Account created successfully! Welcome, " + cname + "!");
                customers[customerCount++] = Customers;

                //customers[customerCount++] = new Customer(cname,cemail,cusername,cpassword,cphoneNumber);
             }

            int choice = 0;

            do {
                
                System.out.println("******************************");
                System.out.println("       Main Menu            ");
                System.out.println("******************************");

                System.out.println("Buy a seat");
                System.out.println("Cancel seat");
                System.out.println("Find  1st Availabale ");
                System.out.println("Show Seating plans ");
                System.out.println("Show all tickets ");
                System.out.println("Exit ");

            
                // Check user input
                try {
                
                    choice = scanner.nextInt();   
                } catch (InputMismatchException e) {
                    System.out.println(" ERROR: Please enter NUMBERS only!");
                    scanner.nextLine();   
                    continue;
                    

                }   //functions
                    scanner.nextLine();

                    switch (choice) {
                        case 1: ByeaSeat();
                            break;

                        case 2:CancelSeat();
                            break;

                        case 3:NowYoucanFind1stAvailableSeats();
                            break;

                        case 4:ShowAllYourSeatingPlans();
                            break;
                        
                        case 5: showAlltickets();
                            break; 
                        
                        case 6:Exiting();
                            return;
                        
                        default:
                            System.out.println("Invalid choice. Please try again.");

                    }
                
                } while (choice != 6);


        }

      

       }
    
    public static void ByeaSeat() {
        System.out.println("Are you buy a seat for you  or for someone else? press y for you or any other key for someone else");
        String forYou = scanner.nextLine();
        if(forYou.equals("y")){
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();
            System.err.println("Enter your password: ");
                String password = scanner.nextLine();
            if(username.equals("cusername") && password.equals("cpassword")){
                System.out.print("Loging in successful! ");
                
                }else{
                    System.out.println("Incorrect password or username . Proceeding as guest.");
                     }

                    
            String name = scanner.nextLine();
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            Ticket Ticket = new Ticket(name, email);
            Ticket newtickets [] = new Ticket[tickets.length +1] ;
            for(int i=0; i<tickets.length;i++){

                newtickets[i]=tickets[i];
            
            }

            Ticket.printTicket();
            tickets  [ticketCount++] =  Ticket;

            return;
        }
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        
        Ticket Ticket = new Ticket(name, email);

        Ticket newtickets [] = new Ticket[tickets.length +1] ;

        for(int i=0; i<tickets.length;i++){

            newtickets[i]=tickets[i];
        

        }

        Ticket.printTicket();
        tickets  [ticketCount++] =  Ticket;}
        
        
        public static void CancelSeat(){

       showAlltickets();

        System.out.println("What is your ticket number?");
        while(true){
        int ticketNumber ;
       try
            { 
             ticketNumber = scanner.nextInt(); 

            }catch (Exception e)  {
                System.out.println("Invalid input. Please enter a valid ticket number.");
                scanner.nextLine(); 
                continue;
         };

             
                    
        tickets[ticketNumber-1].printTicket();
        System.out.println("press y to confirm cancellation orany other key to abort:");
        String comformation = scanner.next();
        if(comformation.equals("y")){
            tickets[ticketNumber -1] = null;
            System.out.println("you are successfully cancelled your ticket");
        }else{
            System.out.println("cancellation aborted");}
        break;

        }
    

    };

    public static void NowYoucanFind1stAvailableSeats(){
        System.out.println("Now you can Find 1st Available Seats!");
    }
    public static void ShowAllYourSeatingPlans(){
        System.out.println("Show All Your Seating Plans!");
    }
    public static void showAlltickets (){

        
        // for(int x = 0; x<tickets.length ; x++){
        //     tickets[x].printTicket();
        // }
        
        for(Ticket ticket : tickets){ 
            if(ticket != null){
                ticket.printTicket();  
            } 
        }
            

     }
        


      
    public static void Exiting(){
        System.out.println("Exiting the menu. Goodbye!");
        
    }


}