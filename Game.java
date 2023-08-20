import java.util.*;

class Guesser {
    int guessNum;

    int guessingNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! Enter the number:");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Player {
    int guessnum;

    int guessingNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player enter the number:");
        guessnum = scan.nextInt();
        return guessnum;

    }
}

class Umpiar {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser G = new Guesser();
        numFromGuesser = G.guessingNum();
    }

    void collectNumFromPlayer() {
        Player P1 = new Player();
        numFromPlayer1 = P1.guessingNum();

        Player P2 = new Player();
        numFromPlayer2 = P2.guessingNum();

        Player P3 = new Player();
        numFromPlayer3 = P3.guessingNum();
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("every player guess the right number!!!");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("player1 and player2 won the match!!!");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("player1 and player3 wom the match!!!");
            } else {
                System.out.println("player 1 is won the game!!");
            }
        }

        else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("player2 and player3 won the match!!!");
            } else {
                System.out.println("player 2 is won the game!!");
            }
        }

        else if (numFromGuesser == numFromPlayer3) {
            System.out.println("player3 is won the game!!");
        }

        else {
            System.out.println("no one is correct!!");
        }
    }
}

public class Game {
    public static void main(String[] args) {
        System.out.println("GAME STARTED !!!");

        Umpiar U = new Umpiar();
        U.collectNumFromGuesser();
        U.collectNumFromPlayer();
        U.compare();

    }
}
