public class TestOrder {

    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 5.25;
        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 2.25;
        Item item3 = new Item();
        item3.name = "Latte";
        item3.price = 6.25;
        Item item4 = new Item();
        item4.name = "Capaccino";
        item4.price = 3.25;

        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";
        // Menu items

        // Order variables -- order1, order2 etc.

        // Application Simulations

        order1.items.add(item3);
        order1.total += item3.price;

        order2.items.add(item1);
        order2.total += item1.price;

        order3.items.add(item3);
        order3.total += item3.price;

        order4.items.add(item3);
        order4.total += item4.price;

        order1.ready = true;

        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.total += item2.price;

        order2.ready = true;

        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Order: %s\n", item3.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n \n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Order: %s\n", item1.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n \n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Order: %s\n", item1.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n \n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Order: %s\n", item4.name);
        System.out.printf("Order: %s\n", item2.name);
        System.out.printf("Order: %s\n", item2.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n \n", order4.ready);
    }
}
