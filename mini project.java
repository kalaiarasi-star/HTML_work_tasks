// ===== Interface (defines behavior) =====
interface Drivable {
    void start();
    void stop();
}


// ===== Abstraction (abstract class) =====
abstract class Vehicle implements Drivable {
    protected String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method (must be implemented by child)
    public abstract void drive();
}


// ===== Composition class (Engine belongs to Car) =====
class Engine {
    private int horsepower;   // Encapsulation (private)

    // Constructor
    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    // Getter (controlled access)
    public int getHorsepower() {
        return horsepower;
    }

    public void run() {
        System.out.println("Engine running with " + horsepower + " HP");
    }
}


// ===== Concrete class =====
class Car extends Vehicle {

    // Composition (Car HAS-A Engine)
    private Engine engine;

    // Constructor
    public Car(String brand, Engine engine) {
        super(brand);
        this.engine = engine;
    }

    // Interface methods
    public void start() {
        engine.run();
        System.out.println(brand + " car started");
    }

    public void stop() {
        System.out.println(brand + " car stopped");
    }

    // Abstract method implementation
    public void drive() {
        System.out.println(brand + " is driving...");
    }
}


// ===== Main class =====
public class mini {
    public static void main(String[] args) {

        Engine engine = new Engine(200);   // Composition
        Car car = new Car("Toyota", engine);

        car.start();
        car.drive();
        car.stop();
    }
}
