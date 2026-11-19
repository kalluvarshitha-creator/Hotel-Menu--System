import java.util.*;
public class Main {
    static void mainmenu() {
        System.out.println("\n===== MAIN MENU =====");
        System.out.println("1. Breakfast");
        System.out.println("2. Tea & Coffee");
        System.out.println("3. Payment");
        System.out.println("4. Exit");
    }

    static void breakfast_submenu() {
        System.out.println("\n===== BREAKFAST =====");
        System.out.println("1. Idly - Rs.40");
        System.out.println("2. Dosa - Rs.45");
        System.out.println("3. Puri - Rs.35");
        System.out.println("4. Upma - Rs.35");
        System.out.println("5. Pongal - Rs.30");
        System.out.println("6. Back");
        System.out.println("Enter your choice:");
    }

    static void tea_coffee_submenu() {
        System.out.println("\n===== TEA & COFFEE =====");
        System.out.println("1. Tea - Rs.20");
        System.out.println("2. Coffee - Rs.25");
        System.out.println("3. Milk - Rs.30");
        System.out.println("4. Back");
        System.out.println("Enter your choice:");
    }

    static void payment_submenu() {
        System.out.println("\n===== PAYMENT =====");
        System.out.println("1. Cash");
        System.out.println("2. UPI");
        System.out.println("3. Card");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, subchoice;
        int total = 0;
        int f, k;

        while (true) {

            mainmenu();
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Breakfast
                    f = 0;

                    while (true) {

                        breakfast_submenu();
                        subchoice = sc.nextInt();

                        switch (subchoice) {

                            case 1:
                                System.out.println("Idly selected");
                                total = total + 40;
                                break;

                            case 2:
                                System.out.println("Dosa selected");
                                total = total + 45;
                                break;

                            case 3:
                                System.out.println("Puri selected");
                                total = total + 35;
                                break;

                            case 4:
                                System.out.println("Upma selected");
                                total = total + 35;
                                break;

                            case 5:
                                System.out.println("Pongal selected");
                                total = total + 30;
                                break;

                            case 6:
                                System.out.println("Back");
                                f = 1;
                                break;

                            default:
                                System.out.println("Invalid option");
                        }

                        if (f == 1)
                            break;
                    }
                    break;

                case 2:
                    // Tea & Coffee
                    k = 0;

                    while (true) {

                        tea_coffee_submenu();
                        subchoice = sc.nextInt();

                        switch (subchoice) {

                            case 1:
                                System.out.println("Tea selected");
                                total = total + 20;
                                break;

                            case 2:
                                System.out.println("Coffee selected");
                                total = total + 25;
                                break;

                            case 3:
                                System.out.println("Milk selected");
                                total = total + 30;
                                break;

                            case 4:
                                System.out.println("Back");
                                k = 1;
                                break;

                            default:
                                System.out.println("Invalid option");
                        }

                        if (k == 1)
                            break;
                    }
                    break;

                case 3:
                    // Payment
                    payment_submenu();

                    if (total == 0) {
                        System.out.println("You haven't bought anything yet");
                    } 
                    else {

                        System.out.println("Total bill = Rs." + total);
                        System.out.println("Enter payment method:");
                        subchoice = sc.nextInt();

                        switch (subchoice) {

                            case 1:
                                System.out.println("Payment done by Cash");
                                System.out.println("Bill paid successfully");
                                total = 0;
                                System.out.println("Thank You");
                                System.exit(0);
                                break;

                            case 2:
                                System.out.println("Payment done by UPI");
                                System.out.println("Bill paid successfully");
                                total = 0;
                                break;

                            case 3:
                                System.out.println("Payment done by Card");
                                System.out.println("Bill paid successfully");
                                total = 0;
                                break;

                            default:
                                System.out.println("Invalid option");
                        }
                    }
                    break;

                case 4:
                    if(total==0){
                        System.out.println("Thank You");
                        System.exit(0);
                    }else{
                    System.out.println("Please complete payment before exiting.");
                    
                    }
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}

