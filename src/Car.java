class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String model, String id, int numDoors) {
        super(brand, model, id);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
    }

    public void addComment(String spaciousInterior) {
    }
}