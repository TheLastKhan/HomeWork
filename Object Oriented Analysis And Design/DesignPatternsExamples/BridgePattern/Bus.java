/* RefinedAbstraction - 1*/
class Bus extends Vehicle {

    public void addGear(Gear gear) {
        super.gear = gear;
        System.out.print("Bus handles ");
        gear.handleGear();
    }
}