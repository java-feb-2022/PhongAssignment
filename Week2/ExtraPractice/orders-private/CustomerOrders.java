//package Java2022.PhongAssignment.Week2.ExtraPractice.ordersprivate;

import java.util.ArrayList;

public class CustomerOrders {

    // Order class member variables
    private String name;
    private double total;
    private boolean ready;

    private ArrayList<Item> items = new ArrayList<Item>();

    public CustomerOrders() {

    }

    public CustomerOrders(String name) {
        this.ready = false;
        this.name = name;

    }

    public void setReady(boolean ready) {
        this.ready = ready;

    }

    public boolean getReady() {
        return ready;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;

    }

    public void addItem(Item parm) {
        this.items.add(parm);

    }

    public void displayOrder() {

        System.out.println("Customer Name is: " + this.name);
        for (Item i : this.items) {

            this.total += i.getPrice();
            // System.out.println("Drink ordered: " + i.getName());
            System.out.printf("%s cost $ %.2f %n", i.getName(), i.getPrice());
            // System.out.printf("%s cost Price of drink is: $ %.2f %n", i.getPrice());

        }

        System.out.printf("Order total is $ %.2f %n", this.total);

    }

    public String orderReady() {
        System.out.printf("%s your ", this.name);
        if (this.ready == true) {

            return "Order is ready :) ";

        } else {
            return "Order is not ready :( ";
        }

    }

}
