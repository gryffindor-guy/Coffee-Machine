package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(cups * 200 + " ml of water");
        System.out.println(cups * 50 + " ml of milk");
        System.out.println(cups * 15 + " g of coffee beans");
        */
        System.out.println("Write how many ml of water the coffee machine has:");
        int amountOfWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int amountOfMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int amountOfBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int requiredCups = scanner.nextInt();
        int availableCups = Math.min(Math.min(amountOfWater / 200, amountOfMilk / 50), amountOfBeans / 15);
        if (requiredCups == availableCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (requiredCups < availableCups) {
            int difference =  availableCups - requiredCups;
            System.out.println("Yes, I can make that amount of coffee (and even " + difference + " more than that)");
        } else {
            System.out.println("No, I can make only " + availableCups + " cup(s) of coffee");
        }
        
    }
}
