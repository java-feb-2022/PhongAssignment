//package Java2022.PhongAssignment.Week2.ExtraPractice.ordersprivate;

import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items

        Item item1 = new Item("Mocha", 5.2);
        Item item2 = new Item("Lattte", 4.25);
        Item item3 = new Item("drip coffee", 3.25);
        Item item4 = new Item("capuccino", 5.75);

        CustomerOrders order1 = new CustomerOrders("Cindhuri");

        CustomerOrders order2 = new CustomerOrders("Jimmy");

        CustomerOrders order3 = new CustomerOrders("Noah");

        CustomerOrders order4 = new CustomerOrders("Sam");

        order2.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);
        order4.addItem(item2);
        order4.addItem(item2);
        order1.displayOrder();
        order2.displayOrder();
        order3.displayOrder();
        order4.displayOrder();
        order1.setReady(true);
        order2.setReady(true);
        System.out.println(order1.orderReady());
        System.out.println(order2.orderReady());

        // System.out.printf("Name: %s\n", order1.getName());
        // System.out.printf("Total: %s\n", order1.getorderRready());
        // System.out.printf("Ready: %s\n", order1.getready());
    }
}
