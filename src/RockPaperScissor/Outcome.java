package RockPaperScissor;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Outcome {
    String playerHand;
    String computerHand;
    //0 for player, 1 for computer, 2 for draw
    int winner;

    Outcome(String playerHand, String computerHand){
        this.playerHand = playerHand;
        this.computerHand = computerHand;
        winner = determineWinner();
    }

    private int determineWinner() {
        //draw
        if(playerHand.equalsIgnoreCase(computerHand))
            return 2;

        if(playerHand.equalsIgnoreCase("Rock")){
            if(computerHand.equalsIgnoreCase("Paper"))
                return 1;//computer wins
            else
                return 0;//computer loses
        }

        if(playerHand.equalsIgnoreCase("Paper")){
            if(computerHand.equalsIgnoreCase("Rock"))
                return 0;//computer loses
            else
                return 1;//computer win-Scissor
        }

        if(playerHand.equalsIgnoreCase("Scissor")){
            if(computerHand.equalsIgnoreCase("Paper"))
                return 0; //Computer Looses
            else //"Rock"
                return 1;//Computer Wins
        }

        return -1;//Error
    }

    public int getWinner() {
        return winner;
    }

    //----------------------------------------------------------------

    public static void main(String[] args) {
        ArrayList<Outcome> file = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        String playerHand;
        String computerHand;
        String stop;

        do {
            System.out.println("Rock Paper Scissor, Shoot :- Your Hand?");
            playerHand = scan.next();
            computerHand = getComputerHand(rnd.nextInt(3));
            System.out.println("Computer Hand: " + computerHand );


            file.add(new Outcome(playerHand, computerHand));

            System.out.println("Stop? Yes/No");
            stop = scan.next();
        } while (!stop.equalsIgnoreCase("Yes"));

        //Summary
        resultSummary(file);
    }

    public static String getComputerHand(int i){
        if(i == 0)
            return "Rock";
        else if(i == 1)
            return "Paper";
        else
            return "Scissor";
    }

    public static void resultSummary(ArrayList<Outcome> file){
        int playerWins = 0;
        int computerWins = 0;
        int drawCount = 0;

        for(int i = 0; i < file.size(); i++){
            if(file.get(i).getWinner() == 0)
                playerWins++;
            else
            if (file.get(i).getWinner() == 1)
                computerWins++;
            else
                drawCount++;
        }

        System.out.println("The Computer won: "+
                (double)computerWins/file.size() * 100 + "% playing random");
        System.out.println("Summary===="+
                "\nTotal play: "+file.size() +
                "\nplayerWins: "+playerWins +
                "\ncomputerWins: "+ computerWins +
                "\nDraws: "+ drawCount);
    }
}
