public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String notReadyMessage = ", your order is not ready yet.  Please give us a few min.";
        String displayTotalMessage = ", Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2;
        int cafeLate = 3;
        int Cappucino = 3;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        String customer5 = "Billy";
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        boolean isReadyOrder5 = false;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);
        if (isReadyOrder1 == true) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + notReadyMessage);
        }

        System.out.println(customer1 + displayTotalMessage + mochaPrice);
        System.out.println(customer5 + displayTotalMessage + Cappucino);

        // Noah
        System.out.println(generalGreeting + customer4);
        System.out.println(customer4 + pendingMessage);
        if (isReadyOrder4 == true) {
            System.out.println(customer4 + readyMessage);
        } else {
            System.out.println(customer4 + notReadyMessage);
        }

        System.out.println(customer4 + displayTotalMessage + cafeLate);
        // Sam
        System.out.println(generalGreeting + customer2);
        System.out.println(customer2 + pendingMessage);
        if (isReadyOrder2 == true) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + notReadyMessage);

        }

        System.out.println(customer2 + readyMessage + displayTotalMessage + cafeLate * 2);
        System.out.println(customer3 + displayTotalMessage + (cafeLate - dripCoffee));
    }
}
