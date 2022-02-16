public class BaristaItem {
    private String name;
    private double price;
    // code defining contructors/methods will go inside class

    public BaristaItem(String name, double price) { /// over load constructors.
        this.name = name;
        this.price = price;

    }

    // create settter/getters so call on the setName/Setprice method in the Test
    // file
    public void setName(String nameInput) {
        this.name = nameInput;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double priceInput) {
        this.price = priceInput;
    }

    public double getPrice() {
        return this.price;
    }

}
