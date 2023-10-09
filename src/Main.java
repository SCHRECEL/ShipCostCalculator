import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfItem = 0.0;
        double shippingCost = 0.02;
        double totalPrice = 0.0;

        System.out.println("Enter the price of your item: ");
        priceOfItem = scanner.nextDouble();

        if (priceOfItem < 100){
            shippingCost *= priceOfItem;
            totalPrice = priceOfItem + shippingCost;
            System.out.println("Shipping is : "+shippingCost+" Your total is: "+totalPrice);
        }
        else {
            totalPrice = priceOfItem;
            System.out.println("Shipping is free, your total is: "+totalPrice);
        }

    }
}