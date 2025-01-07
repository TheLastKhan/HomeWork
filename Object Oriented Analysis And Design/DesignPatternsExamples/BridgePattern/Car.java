/* RefinedAbstraction - 1*/
class Car extends Vehicle {

    public void addGear(Gear gear) {
        super.gear = gear;
        System.out.print("Car handles ");
        gear.handleGear();
    }
}