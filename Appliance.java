public class Appliance {
    String brand;
    double power; // in watts
    public Appliance(String brand, double power) {
        this.brand = brand;
        this.power = power;
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power + " watts");
    }
} 