import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Double Dice Game!");
        System.out.println("It's simple, just try to roll the same two number dice.");
        System.out.println();
        System.out.println("Press r to roll");


        int dice1 = 0;
        int dice2 = 1;
        int streak = 0;
        int tries = 0;
        String userInput = "";

        Scanner scan = new Scanner(System.in);
        userInput = scan.nextLine();
        if (userInput.equals("r")) {
            dice1 = Dice.diceRoll();
            System.out.println("Dice 1 is " + dice1);
            dice2 = Dice.diceRoll();
            System.out.println("Dice 2 is " + dice2);
        }

        if (dice1 == dice2) {
            System.out.println("You win! The two dice are the same.");
            tries += 1;
            streak += 1;
            System.out.println("tries; " + tries);
            System.out.println("streak: " + streak);
        } else {
            streak = 0;
            tries += 1;
            System.out.println("You lost. You can try again or quit (a=try again, q=quit)");
        }
        userInput = scan.nextLine();
        if (userInput.equals("q")) {
            System.out.println("Game over");
            System.out.println("tries: " + tries);
            System.out.println("streak: " + streak);
        } else {
            System.out.println("Press r to roll again!");
        }

        while (!(dice1 == dice2)) {
            userInput = scan.nextLine();

            if (userInput.equals("r")) {
                dice1 = Dice.diceRoll();
                System.out.println("Dice 1 is " + dice1);
                dice2 = Dice.diceRoll();
                System.out.println("Dice 2 is " + dice2);
            }
            if (dice1 == dice2) {
                System.out.println("You win!");
                tries += 1;
                System.out.println("tries: " + tries);
                System.out.println("streak: " + streak);
            } else {

                System.out.println("You can try again or quit (a=try again, q=quit)");
                userInput = scan.nextLine();
                if (userInput.equals("q")) {
                    System.out.println("Game over");
                    System.out.println("tries: " + tries);
                    System.out.println("streak: " + streak);
                } else {
                    System.out.println("Press r to roll again!");
                    tries += 1;
                }

            }
        }
    }
}
