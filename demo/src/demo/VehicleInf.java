package demo;

public interface VehicleInf {
    // An abstract method
    void cleanVehicle();

    // A default method in the interface
    default void startEngine() {
        System.out.println("Engine started.");
    }
}
