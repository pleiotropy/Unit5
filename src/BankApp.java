import java.util.Scanner;
public class BankApp {
    // instance variables
    private String userName;
    private BagelShop userBagelShop;
    private CreditCard userCreditCard;
    private Bank userBank;

    // constructor(s)
    public BankApp(String n, BagelShop bs, CreditCard c, Bank b) {
        userName = n;
        userBagelShop = bs;
        userCreditCard = c;
        userBank = b;
    }

    // method(s)
    public void transaction(String i) {
        Scanner s = new Scanner(System.in);
        int n;
        String pin;
        if (i.toLowerCase().equals("p")) {
            System.out.println("You want to purchase bagels.");
            System.out.print("How many bagels do you want to purchase? ");
            n = Integer.parseInt(s.nextLine());
            System.out.print("Enter your credit card pin: ");
            pin = s.nextLine();
            boolean buyBagels = userBagelShop.payForBagels(userCreditCard, n, pin);
            if (buyBagels) {
                System.out.println("Purchase approved.");
            }
            else {
                System.out.println("Purchase declined.");
            }
        }
        else if (i.toLowerCase().equals("r")) {
            System.out.println("You want to return bagels.");
            System.out.print("How many bagels do you want to return? ");
            n = Integer.parseInt(s.nextLine());
            System.out.print("Enter your credit card pin: ");
            pin = s.nextLine();
            boolean returnBagels = userBagelShop.returnBagels(userCreditCard, n, pin);
            if (returnBagels) {
                System.out.println("Return complete.");
            }
            else {
                System.out.println("Return unsuccessful.");
            }
        }
        else {
            System.out.println("??? Enter P to purchase or R to return bagels.");
        }
    }
    public void payCreditCard() {
        Scanner s = new Scanner(System.in);
        int p;
        System.out.println("Your current balance is: " + userCreditCard.getBalanceOwed());
        System.out.print("How much would you like to pay? ");
        p = Integer.parseInt(s.nextLine());
        userBank.makePayment(userCreditCard,p);
        System.out.println("Your new balance is: " + userCreditCard.getBalanceOwed());
    }
    public CreditCard openSecondCreditCard() {
        // get the user's name - CC.java
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your name to create your 2nd credit card account: ");
        String name = s.nextLine();

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
        CreditCard card2 = new CreditCard(name, pin1);
        return card2;
    }
    public CreditCard compareCreditCardBalances(CreditCard card1, CreditCard card2) {
        return userBank.lowerBalance(card1,card2);
    }
    public void depositProfitIntoBank() {
        System.out.println(userBagelShop.getName() + "'s current profit is: " + userBagelShop.getProfit());
        System.out.println("Your bank's current balance is: " + userBank.getVendorAccountBalance());
        System.out.println("Depositing profits...");
        userBagelShop.depositProfits();
        System.out.println("Your bank's new balance is: " + userBank.getVendorAccountBalance());
    }
    public void checkInventory() {
        System.out.println(userBagelShop.getName() + "'s current inventory is: " + userBagelShop.getInventory());
    }

    // Show a menu with a sentinel value and a while loop
    public void displayMenu() {
        System.out.println("===============================================");
        System.out.println("= = = = = = = = = = M E N U = = = = = = = = = =");
        System.out.println("===============================================");
        System.out.println("1. Make a purchase or return at " + userBagelShop.getName() + ".");
        System.out.println("2. Make a payment on a credit card.");
        System.out.println("3. Open a second credit card.");
        System.out.println("4. Compare credit card balances.");
        System.out.println("5. (Bagel Shop Owners Only) Deposit profits into the bank.");
        System.out.println("6. (Bagel Shop Owners Only) Check inventory.");
        System.out.println("0. Quit the program.");
        System.out.println("===============================================");
    }

    //


}
