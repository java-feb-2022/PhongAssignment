//package ExtraPractice.Zoo1;

class Bat extends Mammal {

    public Bat(int defaultEnergy) {
        super(defaultEnergy);
        // TODO Auto-generated constructor stub

    }

    public Bat() {
        super(300);
        // TODO Auto-generated constructor stub

    }

    // test- attacking 3 towns, eating 2 humans, fly 2x, display engery
    public void fly() {
        System.out.println("Bat flying sound OoooOOOOOOooooo -50 ");
        engergyLevel -= 50;

    }

    public void eatHumans() {
        System.out.println("Bat eating human sound chump chump chump +25 ");
        engergyLevel += 25;

    }

    public void attackTown() {
        System.out.println("Bat attacking sound BAM!!! -100");
        engergyLevel -= 100;

    }

}
