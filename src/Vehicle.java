class Vehicle {
    private String brand;
    private String model;
    private String id;
    private String comments;

    public Vehicle(String brand, String model, String id) {
        this.brand = brand;
        this.model = model;
        this.id = id;
        this.comments = "";
    }

    protected void displayInfo(){
        System.out.println(brand + " " + model + " (Id: " + id + ")");
    }
}
