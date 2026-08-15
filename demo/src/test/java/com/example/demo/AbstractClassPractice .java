public abstract class Appliance {
    protected String brand;

    public Appliance(String brand){
        this.brand = brand;
    }

    public abstract void turnOn();

    public void turnOff() {
        System.out.println("Turning off " + brand + " appliance.");
    }
}