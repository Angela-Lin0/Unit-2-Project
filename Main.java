//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Double Dice Game!");
        System.out.println("It's simple, just try to roll the same two number dice.");
        System.out.println();

        int dice1 = 0;
        int dice2 = 1;
        String input = "";

        while (!(dice1 == dice2)) {
            System.out.println("Press r to roll!");
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();

            if (input.equals("r")) {
                dice1 = Dice.diceRoll();
                System.out.println("Dice 1 is " + dice1);
                dice2 = Dice.diceRoll();
                System.out.println("Dice 2 is " + dice2);
            }
        }

        if (dice1 == dice2) {
            System.out.println("You win!");
        } else {
            System.out.println("You can try again or quit (a=try again, q=quit");

        }


        int streak = 0;
        if (dice1 == dice2) {
            streak += 1;
        }

        int tries = 0;
        //if ()


    }
}
