
public class HelloJava {

    public static void main(String[] args) {
        System.out.println("Hello Team Java");
        // primitive types:
        byte myByte = 52; // 1 byte
        // int myInt= 2323232323232233232323232323; //cannot store decimal
        // float myFloat= 230.2000990f; //put f after fload type
        // boolean myBool= true; //true or false

        // no other functionality- you make it and store it and use it
        System.out.println("\nMy age is " + myByte); // \n next line

        // //non-primitive types: string/arrays/classes

        String firstName = "alexanderthegreatruledtheworld";

        // firstName.toUpCase(); // change text to Caps
        // //toUpperCase- is a class in the library.
        // //you write library where others will use
        // System.out.println(firstName.length());
        System.out.println(firstName.toUpperCase());
        System.out.println(firstName.length());

        greet();
        greet("Bobby");
        System.out.println(evenOdd(200));
        System.out.println(evenOdd(201));
        oneTo255();
    }

    public static void greet() {
        System.out.println("Welcome to Java!!!");
    }

    public static void greet(String name) {
        System.out.printf("Welcome to Java %s \n", name);

    }

    public static String evenOdd(int number) {
        if (number % 2 == 0) {
            return number + " No. is even";
        } else {
            return String.format("%d is Odd", number);
        }
    }

    public static void oneTo255() {
        for (int i = 1; i < 7; i++) {
            // System.out.println(x);
            System.out.println(evenOdd(i));
        }

    }

    public class StringDemo {
        public static void main(String[] args) {
            String ninja = "Coding Dojo is Awesome!";
            int length = ninja.length();
            System.out.println("String Length is : " + length);
        }
    }

}

// //method is a function (main is a method)

// public static void greet() {
// System.out.println("welcome java");

// }

// public static void greet(string name() { //method overloading
// //pass in parameter
// }

// //need to call it

// //conditional

// //return need to be string if you're returning next

// public static string evenOdd(int number){
// if(number%2 ==0 ){
// return "No is even";

// }
// else{
// return "No is fase";
// }
// }
// //loops

// public static void oneTo255(){ //not going to return it's going to print
// for (int =1; i<=255; i++ ) {
// evenOdd(i); //reuse the function evenodd above
// System.out.println(evenOdd(i));
// }
// }

// ; use to end ,
// public - write it there, available in any other classes
// case matter (first letter of each word caps
// main method lives in class
// always public and static (this method is only available in this class)
// void - return type ==for main method
// have to compile everytime, need to update the .class file.

// or click compile run button
