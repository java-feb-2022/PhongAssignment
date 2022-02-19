class Mammal {
    protected int engergyLevel = 100; // change to engergyLevel = level after action(s)
    // protected int batDefaultEnergy = 300;

    public Mammal() {
        this.engergyLevel = engergyLevel;

    }

    public int displayEngergy() {
        // new engergyLevel =-5*throw+ 10*eatBanna +(-10climb)
        System.out.printf("Engergy Level: %s \n", engergyLevel);
        return engergyLevel;

    }

    public Mammal(int defaultEnergy) {
        this.engergyLevel = defaultEnergy;
    }

}