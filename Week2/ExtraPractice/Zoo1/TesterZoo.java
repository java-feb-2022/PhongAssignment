// package Zoo1;

// import Mammal;
// import Gorilla;
// import Bata;

public class TesterZoo {
    public static void main(String[] args) {
        Bat newbat = new Bat();

        // test- attacking 3 towns, eating 2 humans, fly 2x, display engery
        newbat.attackTown();
        newbat.attackTown();
        newbat.attackTown();
        newbat.eatHumans();
        newbat.eatHumans();
        newbat.fly();
        newbat.fly();

        newbat.displayEngergy();

        // new engergyLevel =-5*throw+ 10*eatBanna +(-10climb)

        Gorilla newGorilla = new Gorilla();
        newGorilla.throwSomething();
        newGorilla.throwSomething();
        newGorilla.throwSomething();
        newGorilla.throwSomething();
        newGorilla.throwSomething();
        newGorilla.eatBananas();
        newGorilla.eatBananas();
        newGorilla.climb();
        newGorilla.climb();
        newGorilla.displayEngergy();

    }

}
