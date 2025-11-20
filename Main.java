//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        } else {
            System.out.println("You lost. You can try again or quit (a=try again, q=quit)");
            userInput = scan.nextLine();
            if (userInput.equals("q")) {
                System.out.println("Game over");
            } else {
                while (!(dice1 == dice2)) {
                    System.out.println("Press r to roll again!");

                    userInput = scan.nextLine();

                    if (userInput.equals("r")) {
                        dice1 = Dice.diceRoll();
                        System.out.println("Dice 1 is " + dice1);
                        dice2 = Dice.diceRoll();
                        System.out.println("Dice 2 is " + dice2);
                    }
                    if (dice1 == dice2) {
                        System.out.println("You win!");
                    } else {
                        System.out.println("You can try again or quit (a=try again, q=quit)");


                    }
                }
            }
        }





            if (dice1 == dice2) {
                streak += 1;
            }

        }
    }

