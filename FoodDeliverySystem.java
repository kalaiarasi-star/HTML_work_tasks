// Interface
interface Delivery {
    void deliverOrder();
}

// Abstract class (Abstraction)
abstract class FoodOrder {
    private int orderId;          // Encapsulation
    private double price;

    // Constructor
    public FoodOrder(int orderId, double price) {
        this.orderId = orderId;
        this.price = price;
    }

    // Getters (Encapsulation)
    public int getOrderId() {
        return orderId;
    }

    public double getPrice() {
        return price;
    }

    // Setter
    protected void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    public abstract void orderType();

    // Concrete method
    public void showPrice() {
        System.out.println("Order Price: ₹" + price);
    }
}

// Child class
class OnlineFoodOrder extends FoodOrder implements Delivery {

    private String restaurantName;   // Encapsulation

    // Constructor
    public OnlineFoodOrder(int orderId, double price, String restaurantName) {
        super(orderId, price);
        this.restaurantName = restaurantName;
    }

    public void orderType() {
        System.out.println("Order Type: Online Food Order");
    }

    public void deliverOrder() {
        System.out.println("Food delivered from " + restaurantName);
    }
}

// Composition (Customer HAS-A FoodOrder)
class Customer {
    private String customerName;
    private FoodOrder foodOrder;

    // Constructor
    public Customer(String customerName, FoodOrder foodOrder) {
        this.customerName = customerName;
        this.foodOrder = foodOrder;
    }

    public void showOrderDetails() {
        System.out.println("\nCustomer Name: " + customerName);
        System.out.println("Order ID: " + foodOrder.getOrderId());
        foodOrder.orderType();
        foodOrder.showPrice();
    }

    public FoodOrder getFoodOrder() {
        return foodOrder;
    }
}

// Main class
public class FoodDeliverySystem {

    public static void main(String[] args) {

        FoodOrder order = new OnlineFoodOrder(201, 450, "Domino's");

        Customer customer = new Customer("Akshaya", order);

        customer.showOrderDetails();

        ((Delivery) order).deliverOrder();
    }
}