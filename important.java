import java.util.Scanner;

class vehicle {

    int seats;
    int tyres;
    String fuel;

    vehicle(int seats, int tyres, String fuel) {
        this.seats = seats;
        this.tyres = tyres;
        this.fuel = fuel;
    }
}

class car extends vehicle {

    car(int seats, int tyres, String fuel) {
        super(seats, tyres, fuel);
    }

    void vehicleDetails() {
        System.out.println("\nCar Details");
        System.out.println("No.of seats: " + seats);
        System.out.println("No.of tyres: " + tyres);
        System.out.println("Fuel type: " + fuel);
    }

    void start() {
        System.out.println("Car is starting.");
    }

    void stop() {
        System.out.println("Car is stopping.");
    }
}

class bike extends vehicle {

    bike(int seats, int tyres, String fuel) {
        super(seats, tyres, fuel);
    }

    void vehicleDetails() {
        System.out.println("\nBike Details");
        System.out.println("No.of seats: " + seats);
        System.out.println("No.of tyres: " + tyres);
        System.out.println("Fuel type: " + fuel);
    }

    void start() {
        System.out.println("Bike is starting.");
    }

    void stop() {
        System.out.println("Bike is stopping.");
    }
}

public class important {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Car Input
        System.out.println("Enter Car Details");

        System.out.print("Enter number of seats: ");
        int cSeats = sc.nextInt();

        System.out.print("Enter number of tyres: ");
        int cTyres = sc.nextInt();

        System.out.print("Enter fuel type: ");
        String cFuel = sc.next();

        car v1 = new car(cSeats, cTyres, cFuel);

        v1.vehicleDetails();
        v1.start();
        v1.stop();

        // Bike Input
        System.out.println("\nEnter Bike Details");

        System.out.print("Enter number of seats: ");
        int bSeats = sc.nextInt();

        System.out.print("Enter number of tyres: ");
        int bTyres = sc.nextInt();

        System.out.print("Enter fuel type: ");
        String bFuel = sc.next();

        bike v2 = new bike(bSeats, bTyres, bFuel);

        v2.vehicleDetails();
        v2.start();
        v2.stop();

        sc.close();
    }
}