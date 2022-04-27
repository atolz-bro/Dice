import java.util.Random;

public class Dice {
    private int diceValue;
    private Random rnd = new Random();

    Dice(){
        //Generate a random number from 1 to 6
        diceValue = rnd.nextInt(6) + 1;
    }

    public int getDiceValue(){
        return diceValue;
    }

    public int rollDice(){
        return rnd.nextInt(6) + 1;
    }
}
