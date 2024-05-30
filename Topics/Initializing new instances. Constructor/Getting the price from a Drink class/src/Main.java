import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int price = scanner.nextInt();

        // create instance of the Drink class and print the cost of the drink
        Drink drink = new Drink(name,price);
        System.out.println(drink.getPrice());

    }
}

class Drink {
    // declare attributes
    private String name;
    private int price;

    // create constructor to initialize attributes
    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // create method getPrice that returns the price of the drink

    public int getPrice() {
        return this.price;
    }
}