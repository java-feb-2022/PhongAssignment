//package Java2022.PhongAssignment.Week2.ExtraPractice.ordersprivate;

public class Item {

    private String name;
    private double price;

    public Item() {

    }

    public Item(String nameinput, double priceinput) {
        this.name = nameinput;
        this.price = priceinput;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;

    }

}
