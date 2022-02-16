import java.util.ArrayList;

public class Employee {
    // access moidifer (Public/private/protected)
    // Class attributes- what the things you want employees to have

    // private String email;
    // private float pay;
    // only avaiable in the same class. so in this file. Only live with
    // object/instance (mike/lisa/alex)
    private int id;
    private String email;
    private float pay;
    private ArrayList<String> skills = new ArrayList<>();

    // static method
    private static int noOfEmps = 0; // don't belong to object **want something at class level (belong to cafe class
                                     // itself)

    public static int getNoOfEmps() {
        return noOfEmps; // to get the count

    }

    // constructors
    public Employee() {
        // need this to have parmeterize constructors
        noOfEmps++;
    }

    public Employee(String email, float pay) {
        this.email = email; // email from the Employee class.
        this.pay = pay; // pay from the Employee class.
        noOfEmps++;
    }

    // create accessors geters and mutators= setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getPay() {
        return pay;

    }

    public void setPay() {
        this.pay = pay;

    }

    public void setKills(ArrayList<String> skills) {
        this.skills = skills;
    }

    // class method
    public void empDetail() {
        System.out.printf("Emp Email: %s, Emp Pay: %f", this.email, this.pay, this.skills);

    }

    public void bonus() {
        this.pay += 200;
    }

    // overloaded method

    public void bonus(float bounsAmount) {
        this.pay += bounsAmount; // also call polymorphism (name same/ same method with different behavior. )
    }

}
