import java.util.ArrayList;

public class BaristaOrder {
    private String name;
    private boolean ready;
    private ArrayList<BaristaItem> items;
    private double total;

    public BaristaOrder() {
        this.ready = false;
        this.name = "Guest";
        this.items = new ArrayList<BaristaItem>();

    }

    public BaristaOrder(String customName) {
        this.ready = false;
        this.name = customName;
        this.items = new ArrayList<BaristaItem>();

    }

    public void setReady(boolean ready) {
        this.ready = ready;

    }

    public void addItem(BaristaItem parm) {
        this.items.add(parm);
    }

    public void displayOrder() {
    }

    public void getOrderTotal() {
        System.out.printf("Customer Name: %s \n", this.name);
        for (BaristaItem i : this.items) {
            this.total += i.getPrice();
            System.out.printf("%s: $%.2f %n", i.getName(), i.getPrice());
        }
        System.out.printf("Order total is: $ %.2f %n", this.total);
    }

    public String getStatusMessage() {
        System.out.printf("%s, ", this.name);
        if (this.ready == true) {
            return "your order is ready :)";
        } else {
            return "thank you for waiting. Your order will be ready soon :(.";
        }
    }

}
