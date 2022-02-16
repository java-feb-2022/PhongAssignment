public class BaristaTest {
    public static void main(String[] args) {
        BaristaItem item1 = new BaristaItem("Coffee", 3);
        BaristaItem item2 = new BaristaItem("Milk", 2.75);
        BaristaItem item3 = new BaristaItem("Cappicino", 4.5);
        BaristaItem item4 = new BaristaItem("Latte", 5);
        BaristaItem item5 = new BaristaItem("OJ", 2);

        BaristaOrder order1 = new BaristaOrder("Brad");
        BaristaOrder order2 = new BaristaOrder("George");
        BaristaOrder order3 = new BaristaOrder("Don");
        BaristaOrder order4 = new BaristaOrder("Matt");
        BaristaOrder order5 = new BaristaOrder();
        BaristaOrder order6 = new BaristaOrder();

        order1.addItem(item2);
        order1.addItem(item1);
        order1.addItem(item3);
        order1.displayOrder();
        order1.setReady(true);
        order1.getOrderTotal();
        System.out.println(order1.getStatusMessage());// ready

        order3.addItem(item5);
        order3.addItem(item4);
        order3.addItem(item1);
        order3.displayOrder();
        order3.setReady(true);
        order3.getOrderTotal();

        System.out.println(order3.getStatusMessage());// ready

        order2.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item2);
        order2.displayOrder();
        order2.setReady(false);
        order2.getOrderTotal();

        System.out.println(order2.getStatusMessage());// ready

        System.out.println("------Guest Order----------");

        order5.addItem(item2);
        order5.addItem(item3);
        order5.addItem(item2);
        order5.addItem(item1);
        order5.addItem(item5);
        order5.displayOrder();
        order5.setReady(true);
        order5.getOrderTotal();

        System.out.println(order5.getStatusMessage());// ready
        order6.addItem(item2);
        order6.addItem(item3);
        order6.addItem(item2);
        order6.displayOrder();
        order6.setReady(false);
        order6.getOrderTotal();

        System.out.println(order6.getStatusMessage());// ready

    }

}
