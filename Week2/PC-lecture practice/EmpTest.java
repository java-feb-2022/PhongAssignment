import java.util.ArrayList;

public class EmpTest {
    public static void main(String[] args) {
        // System.out.println("OOP!!!!");
        Employee lisa = new Employee();
        lisa.setEmail("lis@cafe.com");

        Employee michael = new Employee("mike@cafe.com", 850000);
        // System.out.println(michael.getEmail() + michael.getPay());
        Employee alex = new Employee("alex.cafe.com", 1);

        michael.empDetail(); // michael "this"use method to call the instance
        lisa.empDetail();
        // lisa.setPay(40040);
        lisa.empDetail();
        michael.bonus();
        michael.empDetail();
        alex.bonus(); /// cannot change it , you get the $200
        alex.bonus(800); /// will call second bonus amount if you provide amount, you provide the
                         /// parameters
        System.out.printf("\n no of total emps: %d \n ", Employee.getNoOfEmps());

        Employee calos = new Employee("car@cafe ", 90323);
        System.out.printf("\n no of total emps: %d ", Employee.getNoOfEmps());
        Employee.getNoOfEmps();

        ArrayList<String> myskills = new ArrayList<>();
        myskills.add("friendly");
        myskills.add("java");
        myskills.add("fun");
        myskills.add("happy");

        lisa.setKills(myskills);
        lisa.empDetail();
    }

}
