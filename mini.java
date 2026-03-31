import java.util.*;

abstract class Vehicle {
    protected String brand;
    protected int horsepower;
    
    public Vehicle(String brand,int horsepower) {   
        this.brand = brand;
        this.horsepower = horsepower;
    }

    public abstract void drive();
    public abstract void start();
    public abstract void stop();
}



class Car extends Vehicle {

    public Car(String brand, int horsepower) {
        super(brand, horsepower);
    }

    public void start() {
        System.out.println("Car engine running with " + horsepower + " HP");
        System.out.println(brand + " car started!");
    }

    public void stop() {
        System.out.println(brand + " car stopped!");
    }

    public void drive() {
        System.out.println(brand + " is driving smoothly");
    }
}

public class mini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter engine horsepower: ");
        int hp = sc.nextInt();

        Car c = new Car(brand, hp);
        c.start();
        c.drive();
        c.stop();

        sc.close();
    }
}


