import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil myCafe = new CafeUtil();
         

        /* ============ App Test Cases ============= */
        System.out.println("\n---- Streak Goal Test----");
        System.out.println("Purchases needed by week 10: " + myCafe.appTest()); // return "sum from apptest method= 55"
        

        // System.out.println("----- Order Total Test----- \n");
        // double[] lineItems = { 3.5, 1.5, 4.0, 4.5 };
        double orderTotal = myCafe.buildList();
        System.out.printf("Order total: %s \n\n", orderTotal);

        // buildList.getOrderTotal(orderList));

        // System.out.println("----- Display Menu Test-----");
        // about utility- pass in the menu. Pass into the displayMenu to is play it.
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        menu.add("milk");
        myCafe.displayMenu(menu);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 5; i++) {
            myCafe.addCustomer(customers);
            System.out.println("\n");
        }
        System.out.println(customers);
    }
}
