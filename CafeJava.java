public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 1.4;
        int lattePrice = 4;
        int cappuciniPrice = 6;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // Cindhuri ordered a coffee. Print to the console the correct status message, based on her order status.
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(displayTotalMessage + lattePrice);
        // Noah ordered a cappucino. Use an if statement to check the status of his order 
        // and print the correct status message. If it is ready, also print the message to display the total. 
        if(isReadyOrder4){
            System.out.println(generalGreeting + customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuciniPrice);
        }
        else{
            System.out.println(generalGreeting + customer4 + pendingMessage);
            
        }
    	// Sam just ordered 2 lattes, print the message to display their total.
        // Next, use an if statement to print the appropriate order status message
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + lattePrice * 2 );
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }
        // Jimmy just realized he was charged for a coffee but had ordered a latte. 
        //Print the total message with the new calculated total (what he owes) to make up the difference.
        System.out.println(generalGreeting + customer3);
        System.out.println(displayTotalMessage + (lattePrice - dripCoffee));
    }
}
