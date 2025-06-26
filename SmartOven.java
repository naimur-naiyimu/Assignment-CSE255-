class Oven extends Appliance {
    String type;

    public Oven(String brand, double power, String type) {
        super(brand, power);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Appliance Type: " + type);
    }
}

public class SmartOven extends Oven {
    boolean wifiEnabled;

    public SmartOven(String brand, double power, String type, boolean wifiEnabled) {
        super(brand, power, type);
        this.wifiEnabled = wifiEnabled;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("WiFi Enabled: " + (wifiEnabled ? "Yes" : "No"));
    }
} 