/* Client program */
public class Client {
    public static void main(String args[]) {
        Gear gear1 = new ManualGear();
        Gear gear2 = new AutoGear();
        Gear gear3 = new HybridGear();

        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Truck();
        Vehicle vehicle3 = new Bus();

        vehicle1.addGear(gear1);
        vehicle1.addGear(gear2);
        vehicle1.addGear(gear3);

        vehicle2.addGear(gear1);
        vehicle2.addGear(gear2);
        vehicle2.addGear(gear3);

        vehicle3.addGear(gear1);
        vehicle3.addGear(gear2);
        vehicle3.addGear(gear3);
    }
}