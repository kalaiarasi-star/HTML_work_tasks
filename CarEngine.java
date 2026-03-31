import java.util.Scanner;
interface Drivable {
    void start();
    void stop();
}
abstract class Vehicle implements Drivable {
    protected String brand;
 Vehicle(String brand) {   
        this.brand = brand;
    }
    public abstract void drive();
}
class Engine {
    private int horsepower;

 Engine(int horsepower) {   
        this.horsepower = horsepower;
    }
    public int getHorsepower() {      
        return horsepower;
    }
    public void run() {
        System.out.println("Engine running with " + horsepower + " HP");
    }
}
class Car extends Vehicle {
    private Engine engine;
 Car(String brand, Engine engine) {
        super(brand);
        this.engine = engine;
    }
    public void start() {
        engine.run();
        System.out.println(brand + " car started!");
    }
    public void stop() {
        System.out.println(brand + " car stopped!");
    }
    public void drive() {
        System.out.println(brand + " is driving smoothly ");
    }
}
public class carEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter engine horsepower: ");
        int hp = sc.nextInt();
        Engine engine = new Engine(hp);
        Car c = new Car(brand, engine);
        c.start();
        c.drive();
        c.stop();
    }
}
