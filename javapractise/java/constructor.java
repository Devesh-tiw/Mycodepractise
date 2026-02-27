
class constructor {

    String brand;
    String model;
    int storageGB;

    // 1. Default Constructor
    // (Note: If I delete all other constructors, Java provides this automatically.
    // Since I'm writing my own, the "Automatic" one disappears.)
    // 2. No-Arg Constructor (Manually defined)
    // Used when you want to create an object with "standard" default values.
    constructor() {
        this.brand = "Generic";
        this.model = "Basic";
        this.storageGB = 64;
        System.out.println("No-Arg Constructor called: Creating a basic phone.");
    }

    // 3. Parameterized Constructor
    // Used when you want to specify exact details at the moment of creation.
    constructor(String brandName, String modelName, int storage) {
        this.brand = brandName;
        this.model = modelName;
        this.storageGB = storage;
        System.out.println("Parameterized Constructor called: Creating " + brandName + " " + modelName);
    }

    void displayDetails() {
        System.out.println("Phone: " + brand + " " + model + " | Storage: " + storageGB + "GB");
        System.out.println("------------------------------------");
}

public static void main(String[] args) {

    // Using the No-Arg Constructor
        constructor basicPhone = new constructor();
        basicPhone.displayDetails();

        // Using the Parameterized Constructor
        constructor flagshipPhone = new constructor("Apple", "iPhone 15", 256);
        flagshipPhone.displayDetails();

        // Understanding the "Default" concept:
        // If we had NOT written any constructors above, we could do:
        // SmartPhone autoPhone = new SmartPhone(); 
        // And brand would be null, storage would be 0.
    }
}
