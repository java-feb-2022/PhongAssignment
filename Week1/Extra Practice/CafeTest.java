import java.util.ArrayList;

public class CafeTest {

    public static void main(String[] args) {
        cafe myCafe = new cafe();
        myCafe.chaiLatte();
        myCafe.americano("Jon");
        myCafe.americano("Bill");
        myCafe.americano("Mark");
        // Array
        myCafe.buildArray();

        // ArrayList

        System.out.println(myCafe.buildCustomerArrayList());
        // HashMap
        myCafe.customerFavorites();

        // int[] myArrary = new int[5];
        ArrayList<Integer> myList = new ArrayList<Integer>();
        // System.out.println(myList);
        myList.add(11);
        myList.add(12);
        myList.add(13);
        myList.add(14);
        System.out.println(myList);
        Integer num = myList.get(0);
        System.out.println(num);

        myList.set(3, 15);
        System.out.println(myList);

        ArrayList<Object> things = new ArrayList<Object>();
        things.add(15);
        things.add("Arrays");
        things.add(12.3);
        things.add(new ArrayList<Integer>());
        things.add(392.12);
        System.out.println(things);

    }

}
