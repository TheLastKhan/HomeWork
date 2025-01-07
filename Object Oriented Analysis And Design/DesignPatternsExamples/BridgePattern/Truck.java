/* RefinedAbstraction - 2 */
class Truck extends Vehicle {

    public void addGear(Gear gear) {
        super.gear = gear;
        System.out.print("Truck handles ");
        gear.handleGear();
    }
}