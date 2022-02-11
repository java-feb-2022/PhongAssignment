import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.net.ssl.ManagerFactoryParameters;
import javax.swing.Spring;

public class CafeUtil {

    public void countTester() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);

        }
    }

    // public void appTest() {
    public int appTest() {
        int numweeks = 10, i = 1, sum = 0;
        while (i <= numweeks) {
            sum = sum + i;
            i++;
        }
 
        return sum;
    }

    public Double buildList() {
        Double orderList[] = { 3.5, 1.5, 4.0, 4.5 };
        Double sum = 0.0;

        for (int i = 0; i < orderList.length; i++) {

            sum += orderList[i];

        }
        return sum;
        
    }

    public String weeknotificationString() {
        Date date = new Date();
        return "\n The current date is " + date;
         
    }

    // how to display in a list? like the prompt?
    public void displayMenu(ArrayList<String> menu) {
         
        System.out.println("\n ----- Display Menu Test----- ");
        for(int i=0; i<menu.size(); i++){
            System.out.printf("%s %s\n",  i, menu.get(i));
            
        }
         
    }

    public void addCustomer(ArrayList<String> customers) {
        // System.out.println("\n----- Add Customer Test-----");
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        System.out.println("This the name you entered " + userName);
        System.out.printf("There are %s people in front of you. \n", customers.size());
        customers.add(userName);
        System.out.println(customers);

    }


}


// public void addCustomer(ArrayList<String> customers) {

// System.out.println("Please enter your name");
// String userName;
// String userNamString = System.console().readLine();
// // System.out.printf("Hello %s", userName);

// }
