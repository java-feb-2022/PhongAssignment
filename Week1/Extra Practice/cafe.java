import java.util.HashMap;

import java.util.Arrays;

import java.util.ArrayList;

public class cafe {

    public void chaiLatte() {
        System.out.println("Enjoy your Chai Late!!!");
    }

    public void americano(String customer) {
        System.out.printf("Enjoy your black coffee, %s \n", customer);
    }

    // Array
    public void buildArray() {
        int[] numbers = new int[10];
        // numbers[0] = 1;
        // numbers[1] = 2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(numbers[3]); // print out specific value
        // for each
        for (int i : numbers) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(numbers));
        // string array
        String[] menu = { "Carmel Frap", "Moca", "Hot Chocolate" };
        try {
            menu[3] = "kiwi Refresher";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Oh no, an exception ocurred");

        }

        System.out.println(Arrays.toString(menu));

    }

    // ArrayList- Build customer list
    public int buildCustomerArrayList() {
        ArrayList<String> customers = new ArrayList<>();
        customers.add("Tom");
        customers.add("Matt");
        customers.add("Will");
        customers.add("Charlie");
        customers.add("Rocky");
        customers.add("Billy");
        customers.remove(3);
        System.out.println(customers);
        // ArrayList<Integer> numbers = new ArrayList<>();
        return customers.size();
    }

    public void customerFavorites() {
        HashMap<String, String> favorite = new HashMap<String, String>();
        favorite.put("Bill", "Frap");
        favorite.put("Jean", "Refresher");
        favorite.put("Tom", "OJ");
        favorite.put("Petty", "Coffee");
        favorite.put("Kayne", "Moca");
        favorite.put("Westly", "Espreso");

        System.out.println(favorite.get("Kayne"));
        for (String key : favorite.keySet()) {
            // System.out.println(key + ":" + favorite.get(key));
            System.out.printf("%s favorite drink is %s\n", key, favorite.get(key));
        }
    }

}

// // Array
// public void buildArray() {
// int[] numbers = new int[3];
// // 0 1 2
// // create an array (1-10) and print it's value
// for (int i = 0; i < numbers.length; i++) {
// numbers[i] = i + 1;
// }
// System.out.println(numbers);

// // for each

// for (int i : numbers) {

// }

// // String Arrays
// String[] menu = { "a", "b", "c", "d" };
// // try { //exception handling
// // menu[3]= "kewi"}
// catch(ArrayIndexOutOfBoundsException e){
// System.out.println("oh dear...need more practice");
// }

// }

// // array list- more flexible-it stores objects, does not store primative
// type.
// // not using static -

// // HasMap -key valu e
// public void customerFavorites() {
// HashMap<String, String> favorites = new HashMap<String, String>();
// favorites.put("Rene", "green tea");

// }
// }
