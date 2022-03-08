import java.time.Year;

public class meClass {
    public static void sayName() {
        System.out.println("My Name is Phong");

    }

    public static void sayAge() {
        System.out.println("My Age is 50");

    }

    public static void callingString() {
        String s1 = "Upper And Lower Mix";
        // s1.toUpperCase();
        System.out.println(s1.toUpperCase());
        // s1.toLowerCase();
        System.out.println(s1.toLowerCase());
        int i = s1.length();
        System.out.println(i);
        System.out.println(s1.isEmpty());
        String s2 = "";
        System.out.println("is blank " + s2.isBlank());

    }

    public static void concatenating() {
        String part1 = "Hello";
        String part2 = "World";
        String full = part1 + " " + part2;
        System.out.println(part1 + part2);
        System.out.println(part1 + " " + part2);
        System.out.println(full);
        System.out.println("My favorite number is " + (5 + 3));
        System.out.println(part1.concat(" Universe").isEmpty());
    }

    public static int sum(int x, int u) {
        int sum = x + u;
        System.out.println(sum);
        return sum;
    }

    public static void increment(int x) {
        x++;
        System.out.println(x);
    }

    public static int sumoverload(int x, int y) {
        int sumoverload = x + y;
        System.out.println("sumoverload=" + sumoverload);
        return x + y;

    }

    public static int sumoverload(int x, int y, int z) {
        int sumoverload = x + y + z;
        System.out.println("sumoverload=" + sumoverload);
        return x + y + z;

    }
}
