//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Double Dice Game!");
        System.out.println("It's simple, just try to roll the same two number dice.");
        System.out.println();

        System.out.println("Press the spacebar to roll!");
        Scanner spaceb = new Scanner(System.in);
        String input;
        input = spaceb.nextLine();



        int dice1 = Dice.diceRoll();
        System.out.println("Dice 1 is " + dice1);
        int dice2 = Dice.diceRoll();
        System.out.println("Dice 2 is " + dice2);

        int streak = 0;
        if (dice1 == dice2) {
            streak += 1;
        }

        int tries = 0;



    }
}