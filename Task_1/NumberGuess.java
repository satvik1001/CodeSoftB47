package Task_1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess{
    public static void main(String[] args) {

Random rand=new Random();
Scanner sc=new Scanner(System.in);
int totalScore=0;
boolean playAgain=true;
while(playAgain){
    int numberGuess= rand.nextInt(100)+1;
    int attempLeft=7;
    boolean guessCorrectly=false;
    while(attempLeft>0){
        int userGuess=sc.nextInt();
        attempLeft--;
        if(userGuess==numberGuess){
            System.out.println("Congrats you guess number correctly");
            guessCorrectly=true;
            totalScore+=(attempLeft+1)*10;
            break;
        } else if (userGuess>numberGuess) {
            System.out.println("Too High,Number of attempt Left"+ attempLeft);
        }
        else {
            System.out.println("Too Low, Number Of attempt Left"+ attempLeft);
        }
    }
    if(!guessCorrectly){
        System.out.println("Out of attempt, The Number was" +numberGuess);
    }
    System.out.println("Your current Score" + totalScore);

    System.out.println("Do you want play again, Enter Yes or No");
    String response= sc.next().toLowerCase();
    playAgain=response.equals("yes");
}
        System.out.println("Game Over! Your Score"+ totalScore);
  sc.close();
    }
}