
class Gorilla extends Mammal {

    private int throwBananas;
    private int eatBananas;
    private int climb;
    private int totalEngergy;

    // throw 3x
    // eat 2x
    // climb 1x
    // new engergyLevel =-5*throw+ 10*eatBanna +(-10climb)

    public Gorilla() {
        super();
    }

    public void throwSomething() {
        System.out.println("Gorilla throwing stuff, bady gorilla -5");
        engergyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("Gorilla Eating bananas Yum Yum +5");
        engergyLevel += 5;
    }

    public void climb() {
        System.out.println("Gorilla climb up the tree -5");
        engergyLevel -= 5;
    }

    public void totalEngergy() {
        System.out.println("Climb up the tree");
        engergyLevel -= 5;
    }
}
