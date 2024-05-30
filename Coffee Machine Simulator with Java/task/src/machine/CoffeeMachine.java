package machine;
import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMachine {

    // check if machine can make coffee based on inventory
    public static void canMakeCoffeeCheck() {

        // start scanner
        Scanner scanner = new Scanner(System.in);

        // how many can make
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsNeeded = scanner.nextInt();

        // math
        int coffeeFromWater = water/200, coffeeFromMilk = milk/50, coffeeFromBeans = coffee/15;
        int[] MinIngredients = {coffeeFromWater, coffeeFromMilk, coffeeFromBeans};
        Arrays.sort(MinIngredients);
        int MinCups = MinIngredients[0];


        if (MinCups < cupsNeeded) {
            System.out.printf("No, I can make only %d cup(s) of coffee", MinCups);
        } else if (MinCups > cupsNeeded) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", MinCups-cupsNeeded);
        } else {
            System.out.println("Yes, I can make that amount of coffee");
        }
    }

    // coffee needed per cup calculator
    public static void coffeeNeededForNCups() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need: \n > ");
        int noCups = scanner.nextInt();
        System.out.printf("For %d cups of coffee you will need: %n" +
                "%d ml of water %n " +
                "%d ml of milk %n " +
                "%d g of coffee beans", noCups, noCups*200, noCups*50, noCups*15);
    }

    // describe cooking process
    public static void process() {
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");
    }

    // list inventory
    public static void inventory(int water, int milk, int beans, int money, int cups) {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n", water);
        System.out.printf("%d ml of milk%n", milk);
        System.out.printf("%d g of coffee beans%n", beans);
        System.out.printf("%d disposable cups%n", cups);
        System.out.printf("$%d of money%n", money);
    }

    // buy coffee
    public static int[] buy(int water, int milk, int beans, int money, int cups) {

        // start scanner
        Scanner scanner = new Scanner(System.in);

        // define responses
        String success = "Making your drink :)";
        String failure = "I don't have the ingredients!";

        // ask drink
        System.out.println("What do you want to buy? 1 – espresso, 2 – latte, 3 – cappuccino, back – to main menu:");
        String choice = scanner.next();

        // edit inventory
        switch (choice) {

            case "1": // espresso
                if (water >= 250 && beans >= 16 && cups > 0) {
                    water -= 250;
                    beans -= 16;
                    money += 4;
                    --cups;
                    System.out.println(success);
                } else {
                    System.out.println(failure);
                }
                break;

            case "2": // latte
                if (water >= 350 && milk >= 75 && beans >= 20 && cups > 0) {
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    money += 7;
                    --cups;
                    System.out.println(success);
                } else {
                    System.out.println(failure);
                }
                break;

            case "3": // cappuccino
                if (water >= 200 && milk >= 100 && beans >= 12 && cups > 0) {
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    money += 6;
                    --cups;
                    System.out.println(success);
                } else {
                    System.out.println(failure);
                }
                break;

            default:
                System.out.println("I can't make this! Choose another drink!");
        }

        return new int[]{water, milk, beans, money, cups};

    }

    public static int[] fill() {

        // start scanner
        Scanner scanner = new Scanner(System.in);

        //shorten text
        String prefix = "Write how many ";
        String suffix = " you want to add:";

        // how much fill up?
        System.out.println(prefix + "ml of water" + suffix);
        int water = scanner.nextInt();
        System.out.println(prefix + "ml of milk" + suffix);
        int milk = scanner.nextInt();
        System.out.println(prefix + "grams of coffee beans" + suffix);
        int beans = scanner.nextInt();
        System.out.println(prefix + "disposable cups" + suffix);
        int cups = scanner.nextInt();

        // return values
        return new int[]{water, milk, beans, cups};
    }

    public static void main(String[] args) {

        // start scanner
        Scanner scanner = new Scanner(System.in);

        // define initial values
        int water = 400; // ml
        int milk = 540; // ml
        int beans = 120; // g
        int money = 550; // $
        int cups = 9; // cups

        // end condition
        boolean end = false;


        // list actions
        while (!end) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):\n>");
            switch (scanner.next()) {
                case "buy":

                    int[] inventoryAfterBuy = buy(water, milk, beans, money, cups);
                    water = inventoryAfterBuy[0];
                    milk = inventoryAfterBuy[1];
                    beans = inventoryAfterBuy[2];
                    money = inventoryAfterBuy[3];
                    cups = inventoryAfterBuy[4];

                    break;

                case "fill":

                    int [] inventoryAfterFill = fill();
                    water += inventoryAfterFill[0];
                    milk += inventoryAfterFill[1];
                    beans += inventoryAfterFill[2];
                    cups += inventoryAfterFill[3];

                    break;

                case "take":

                    System.out.println("I give you $" + money);
                    money = 0;

                    break;

                case "remaining":

                    // list inventory
                    inventory(water,milk,beans,money,cups);

                    break;

                case "exit":
                    end = true;
                    break;

                default:

                    System.out.println("That isn't an option! Choose buy, fill or take :)");

        }

        }



    }
}
