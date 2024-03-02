class Motorcycle extends Vehicle {
    private int numWheels;

    public Motorcycle(String brand, String model, String id, int numWheels) {
        super(brand, model, id);
        this.numWheels = numWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of wheels: " + numWheels);
    }

    public void addComment(String greatForCityCommuting) {
    }
}