import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayvsArrayList {
    public static void main(String[] args) {
        /*
         * {
         * // String[] phongsFriend = new String[5];
         * // [0],[1],[2][3]
         * String[] phongsFriendArray = { "long", "tu", "nansai", "Truong", "Vinh" };
         * System.out.println(Arrays.toString(phongsFriendArray));
         * // ArrayList<String> friendArrayList = new ArrayList<>();
         * ArrayList<String> friendArrayList1 = new ArrayList<>(Arrays.asList("John",
         * "Chris", "bob", "frank"));
         * ArrayList<String> friendArrayList2 = new ArrayList<>();
         * friendArrayList2.add("Tom");
         * friendArrayList2.add("Carlos");
         * friendArrayList2.add("Miles");
         * 
         * System.out.println(phongsFriendArray[2]);
         * System.out.println(friendArrayList2);
         * System.out.println(friendArrayList2.get(2));
         * System.out.println(friendArrayList1.get(2));
         * 
         * // get size of arrays
         * System.out.println(phongsFriendArray.length);
         * // get size of arrays list
         * System.out.println(friendArrayList1.size());
         * System.out.println(friendArrayList2.size());
         * // add to array
         * phongsFriendArray[0] = "Alex";
         * System.out.println(Arrays.toString(phongsFriendArray));
         * friendArrayList2.set(2, "Alex");
         * System.out.println(friendArrayList2);
         * friendArrayList1.set(2, "Alex");
         * System.out.println(friendArrayList1);
         * 
         * // remove element array = cannot do
         * // arraylist
         * friendArrayList1.remove(1);
         * System.out.println(friendArrayList1);
         * 
         * }
         */
        /*
         * {
         * HashMap<String, Integer> employId = new HashMap<>();
         * // put values in to map
         * employId.put("Jon", 1212);
         * employId.put("Bill", 8812);
         * employId.put("Frank", 9912);
         * 
         * System.out.println(employId);
         * // get value from map
         * employId.get("Frank");
         * System.out.println(employId.get("Frank"));
         * System.out.println(employId.containsKey("Jon"));
         * System.out.println(employId.containsValue("88"));
         * // change key values data
         * employId.put("thomas", 88009900);
         * System.out.println(employId.get("Jon"));
         * System.out.println(employId);
         * }
         */
        System.out.println("message1");
        sayHi("Hello");
        // sum1(1, 2);
        System.out.println(sum1(5, 2) + sum1(3, 4));
        System.out.println("message2");
        sayHello();

    }

    public static void sayHi(String name) {
        System.out.println(name);
    }

    public static void sayHello() {
        System.out.println("Hello");
        // return;

    }

    // public static int sum(int x, int y) {
    // int sum = x + y;
    // return sum;
    // }

    public static int sum1(int x, int y) {
        return x + y;
        // System.out.println("done");
    }

}
