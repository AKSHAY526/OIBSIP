import java.util.Scanner;

public class AtmInterface {

    private static int amount = 500;
    private static int amount2 = 1500;
    private static String trans = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin");
        int pin = sc.nextInt();

        if (pin == 1234) {
            while (true) {
                System.out.println("WELCOME TO ATM SYSTEM");
                System.out.println("---------------------");
                System.out.println("Select option : ");
                System.out.println("1. Transaction History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Exit");
                System.out.print("Enter your choice : ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("*****Transaction History*****\n");
                        System.out.println("--------------------------------");
                        if (trans.isEmpty()) {
                            System.out.println("No transactions done so far");
                        } else {
                            System.out.println(trans);
                        }
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        int withdrawAmount = sc.nextInt();
                        System.out.println("---------------------------");
                        if (amount >= withdrawAmount) {
                            amount -= withdrawAmount;
                            System.out.println("Amount Rs" + withdrawAmount + "/- withdrawn successfully");
                            System.out.println("Your Available Balance: " + amount);
                            System.out.println("---------------------------");
                            trans += "You withdrew " + withdrawAmount + " successfully\n";
                        } else {
                            System.out.println("Insufficient balance to withdraw the cash");
                            System.out.println("---------------------------");
                        }
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        int depositAmount = sc.nextInt();
                        System.out.println("---------------------------");
                        amount += depositAmount;
                        System.out.println("Amount Rs" + depositAmount + "/- deposited successfully");
                        System.out.println("Your Available Balance: " + amount);
                        trans += "You deposited " + depositAmount + " successfully\n";
                        System.out.println("---------------------------");
                        break;
                    case 4:
                        System.out.print("Enter account number of the receiver's bank: ");
                        int receiverAccNo = sc.nextInt();
                        System.out.print("Enter amount to transfer: ");
                        int transferAmount = sc.nextInt();
                        System.out.println("---------------------------");
                        if (amount >= transferAmount) {
                            amount -= transferAmount;
                            amount2 += transferAmount;
                            System.out.println("Amount Rs" + transferAmount + "/- transferred successfully");
                            System.out.println("Your Available Balance: " + amount);
                            trans += "You transferred " + transferAmount + " successfully\n";
                            System.out.println("Available Balance of Transferred account: " + amount2);
                        } else {
                            System.out.println("Insufficient balance to transfer");
                            System.out.println("---------------------------");
                        }
                        break;
                    case 5:
                        System.out.println("Thank you for using the ATM");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please Enter Correct option");
                        break;
                }
            }
        } else {
            System.out.println("Incorrect! Please enter the correct pin");
        }
    }
}
