public class Vehicle {
    String brand;
    String plate;
    String color;
    int model;

    final String details() {
        return String.format("Brand: %s\nPlate: %s\nColor: %s\nModel: %d", this.brand, this.plate, this.color, this.model);
    }
}
