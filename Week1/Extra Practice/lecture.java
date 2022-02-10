public class lecture {
    public static void main(String[] args) {
        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length();
        System.out.println("String Length is : " + length);

        String string1 = "My name is ";
        String string2 = "Michael";
        String string3 = string1.concat(string2);
        // String string3 = string1.concat(string2);
        System.out.println(string3);

        String ninja1 = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        System.out.println(ninja1);

        String ninja2 = "Welcome to Coding Dojo!";
        int a = ninja2.indexOf("Coding"); // a is 11
        System.out.println(a);
        int b = ninja2.indexOf("co"); // b is 3
        System.out.println(b);

        int c = ninja2.indexOf("pizza"); // c is -1, "pizza" is not found
        System.out.println(c);
        int d = ninja2.indexOf("W"); // b is 3
        System.out.println(d);
        String sentence = "   spaces everywhere!   ";
        System.out.println(sentence.trim());
        String a1 = "HELLO";
        String b1 = "world";
        System.out.println(a1.toLowerCase()); // hello
        System.out.println(b1.toUpperCase()); // WORLD

        // Normal string assignment
        String a2 = "same string";
        String b2 = "same string";
        System.out.println(a2 == b2); // true
        // Creating new strings as separate objects (another way to create a String)
        a2 = new String("same letters");
        b2 = new String("same letters");
        System.out.println(a2 == b2); // false. Not the same object in memory.
        // System.out.println(a3.equals(b3)); // true. same exact characters.

        String d1 = new String("Dojo");
        System.out.println(d1 == "Dojo");
        // surprisingly this will print out `false`

        String a22 = new String("Dojo");
        System.out.println(a22.equals("Dojo"));
        // this actually will print out `true`

    }

    // ...
    // public String guestGreeting(String name, String dayPeriod) {
    // ...

}
