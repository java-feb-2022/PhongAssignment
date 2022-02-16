import java.util.ArrayList;

public class BaristaOrder {
    private String name;
    private boolean ready;
    private ArrayList<BaristaItem> items;

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
}