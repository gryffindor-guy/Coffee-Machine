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
        System.out.println("The coffee machine has:\n" +
                "400 of water\n" +
                "540 of milk\n" +
                "120 of coffee beans\n" +
                "9 of disposable cups\n" +
                "550 of money\n" +
                "\n");

        */
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.next();
        int waterStock = 400;
        int milkStock = 540;
        int beansStock = 120;
        int cupsStock = 9;
        int earnings = 550;
        while (!action.equals("exit")) {
            if (action.equals("fill")) {
                System.out.println();
                System.out.println("Write how many ml of water do you want to add:");
                int addedWater = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int addedMilk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int addedBeans = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int addedCups = scanner.nextInt();
                System.out.println();

                waterStock += addedWater;
                milkStock += addedMilk;
                beansStock += addedBeans;
                cupsStock += addedCups;
            } else if (action.equals("buy")) {
                System.out.println();
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu::");
                if (scanner.hasNextInt()) {
                    int flavor = scanner.nextInt();
                    if (flavor == 1) {
                        waterStock -= 250;
                        beansStock -= 16;
                        earnings += 4;
                        cupsStock -= 1;
                        if (waterStock < 0) {
                            waterStock += 250;
                            beansStock += 16;
                            cupsStock += 1;
                            earnings -= 4;
                            System.out.println("Sorry, not enough water!" +
                                    "\n");
                        } else if (beansStock < 0) {
                            waterStock += 250;
                            beansStock += 16;
                            cupsStock += 1;
                            earnings -= 4;
                            System.out.println("Sorry, not enough coffee beans!" +
                                    "\n");
                        } else if (cupsStock < 0) {
                            waterStock += 250;
                            beansStock += 16;
                            cupsStock += 1;
                            earnings -= 4;
                            System.out.println("Sorry, not enough disposable cups!" +
                                    "\n");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!" +
                                    "\n");
                        }
                    } else if (flavor == 2) {
                        waterStock -= 350;
                        milkStock -= 75;
                        beansStock -= 20;
                        earnings += 7;
                        cupsStock -= 1;
                        if (waterStock < 0) {
                            waterStock += 350;
                            milkStock += 75;
                            beansStock += 20;
                            cupsStock += 1;
                            earnings -= 7;
                            System.out.println("Sorry, not enough water!" +
                                    "\n");
                        } else if (milkStock < 0) {
                            waterStock += 350;
                            milkStock += 75;
                            beansStock += 20;
                            cupsStock += 1;
                            earnings -= 7;
                            System.out.println("Sorry, not enough milk!" +
                                    "\n");
                        } else if (beansStock < 0) {
                            waterStock += 350;
                            milkStock += 75;
                            beansStock += 20;
                            cupsStock += 1;
                            earnings -= 7;
                            System.out.println("Sorry, not enough coffee beans!" +
                                    "\n");
                        } else if (cupsStock < 0) {
                            waterStock += 350;
                            milkStock += 75;
                            beansStock += 20;
                            cupsStock += 1;
                            earnings -= 7;
                            System.out.println("Sorry, not enough disposable cups!" +
                                    "\n");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!" +
                                    "\n");
                        }
                    } else if (flavor == 3) {
                        waterStock -= 200;
                        milkStock -= 100;
                        beansStock -= 12;
                        earnings += 6;
                        cupsStock -= 1;
                        if (waterStock < 0) {
                            waterStock += 200;
                            milkStock += 100;
                            beansStock += 12;
                            cupsStock += 1;
                            earnings -= 6;
                            System.out.println("Sorry, not enough water!" +
                                    "\n");
                        } else if (milkStock < 0) {
                            waterStock += 200;
                            milkStock += 100;
                            beansStock += 12;
                            cupsStock += 1;
                            earnings -= 6;
                            System.out.println("Sorry, not enough milk!" +
                                    "\n");
                        } else if (beansStock < 0) {
                            waterStock += 200;
                            milkStock += 100;
                            beansStock += 12;
                            cupsStock += 1;
                            earnings -= 6;
                            System.out.println("Sorry, not enough coffee beans!" +
                                    "\n");
                        } else if (cupsStock < 0) {
                            waterStock += 200;
                            milkStock += 100;
                            beansStock += 12;
                            cupsStock += 1;
                            earnings -= 6;
                            System.out.println("Sorry, not enough disposable cups!" +
                                    "\n");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!" +
                                    "\n");
                        }
                    }
                } else {
                    String msg = scanner.next();
                    if (msg.equals("back")) {
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        action = scanner.next();
                        continue;
                    }
                }
            } else if (action.equals("take")) {
                System.out.println("\n" +
                        "I gave you $" + earnings  +
                        "\n");
                earnings -= earnings;

            } else if (action.equals("remaining")) {
                System.out.println("\n" +
                        "The coffee machine has:\n" +
                        waterStock + " of water\n" +
                        milkStock + " of milk\n" +
                        beansStock + " of coffee beans\n" +
                        cupsStock + " of disposable cups\n" +
                        "$" + earnings + " of money" +
                        "\n");
            }
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();
        }
    }
}
