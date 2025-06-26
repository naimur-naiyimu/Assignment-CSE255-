public class ApplianceTester {
    public static void main(String[] args) {
        System.out.println("1.===== Smart Oven 1 =====");
        SmartOven lgOven = new SmartOven("LG", 1800, "Convection Oven", true);
        lgOven.displayInfo();
        System.out.println("\n2.===== Smart Oven 2 =====");
        SmartOven samsungOven = new SmartOven("Samsung", 2000, "Grill Oven", false);
        samsungOven.displayInfo();
        System.out.println("\n3.===== Smart Oven 3 =====");
        SmartOven whirlpoolOven = new SmartOven("Whirlpool", 1500, "Solo Oven", true);
        whirlpoolOven.displayInfo();
    }
} 