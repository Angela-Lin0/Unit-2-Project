public class Dice {
    public static int diceRoll() {
        int dice = (int) (Math.random() * 10) + 1;
        return dice;
    }
}

