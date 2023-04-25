import java.util.Scanner;
public class Main
{
    private static Scanner s = new Scanner(System.in);
    private static String name;
    private static Bank bank;
    private static BagelShop shop;
    private static CreditCard card1, card2;

    public static void main(String[] args)
    {
        // welcome the user
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$ Welcome to the BankApp $");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Set up the user's CreditCard
        setUpCreditCard();
        // Set up the user's Bank
        bank = new Bank();
        // Set up the user's BagelShop
        shop = new BagelShop(name + "'s Bagel Shop", 50, 2, bank);
        // create new bankapp object with user's name
        BankApp app = new BankApp(name,shop,card1,bank);

        // Confirm the user's information
        printConfirmationOfAccount(card1);

        // set user's menu choice to an initial value
        int menuChoice = -1;

        // Menu Option Logic
        while (menuChoice != 0) {
            // Print the menu and get user's menu choice
            app.displayMenu();
            System.out.print("Which option would you like to do?: ");
            menuChoice = Integer.parseInt(s.nextLine());

            // 1. Make a purchase or return at the bagel shop.
            if (menuChoice == 1) {
                System.out.print("Would you like to PURCHASE (P) or RETURN (R) a bagel?: ");
                String t = s.nextLine();
                app.transaction(t);
                printConfirmationOfAccount(card1);
            }

            // 2. Make a payment on the credit card.
            else if (menuChoice == 2) {
                app.payCreditCard();
            }

            // 3. Open a second credit card.
            else if (menuChoice == 3) {
                card2 = app.openSecondCreditCard();
                printConfirmationOfAccount(card2);
            }

            // 4. Compare credit card balances.
            else if (menuChoice == 4) {
                if (card1 != null && card2 != null) {
                    CreditCard lowerBalance = app.compareCreditCardBalances(card1,card2);
                    if (lowerBalance != null) {
                        System.out.println(lowerBalance.getAccountHolder() + " has a lower balance.");
                        System.out.println("The balance is: " + lowerBalance.getBalanceOwed());
                    }
                    else {
                        System.out.println("The cards have the same balance (" + card1.getBalanceOwed() + ").");
                    }
                }
                else {
                    System.out.println("You do not have two credit cards to compare.");
                }
            }

            // 5. Deposit profits into the bank.
            else if (menuChoice == 5) {
                app.depositProfitIntoBank();
            }

            // 6. Check inventory.
            else if (menuChoice == 6) {
                app.checkInventory();
            }

            // invalid menu choice
            else {
                if (menuChoice != 0) {
                    System.out.println("Invalid menu choice. Enter a valid choice.");
                }
            }
        }

        // when the program ends, say goodbye to the user
        System.out.println("Thanks for using the BankApp. Good-Bye!");
    }

    private static void setUpCreditCard() {
        // get the user's name - CC.java
        System.out.print("Please enter your name to create a new credit card account: ");
        name = s.nextLine();

        // set the user's pin - CC.java
        System.out.println("You will need a 4-digit PIN to buy or return items purchased with your credit card.");
        System.out.print("Please enter a PIN for your credit card: ");
        String pin1 = s.nextLine();
        String pin2 = "";
        while (!pin1.equals(pin2)) {
            System.out.print("Please enter your PIN again: ");
            pin2 = s.nextLine();
        }

        // create the CreditCard object
        card1 = new CreditCard(name, pin1);
    }
    private static void printConfirmationOfAccount(CreditCard card) {
        System.out.println("===============================================");
        System.out.println("Congratulations! Your account has been created.");
        System.out.println("===============================================");
        System.out.println("Your Credit Card Info: ");
        System.out.println(card.toString());
        System.out.println("===============================================");
        System.out.println("Your Bagel Shop Info: ");
        System.out.println(shop.toString());
        System.out.println("===============================================");
        System.out.println("Your Bank Info: ");
        System.out.println(bank);
        System.out.println("===============================================");

    }
}
