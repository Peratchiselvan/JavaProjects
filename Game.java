/**
 * Created by Selva
 * Made with ❤ in Selvasoft
 */
public class Game {
    Player p1;
    Player p2;
    Player p3;
    int guess;
    boolean gameWon = false;
    void start(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guess = (int) (Math.random() * 10);
        System.out.println("PC guessed " + guess);
        p1.Guess();
        p2.Guess();
        p3.Guess();
        int p1Guess = p1.number1;
        int p2Guess = p2.number1;
        int p3Guess = p3.number1;
        if(p1Guess == guess){
            p1.win();
        }else if (p2Guess == guess){
            p2.win();
        }else if (p3Guess == guess){
            p3.win();
        }
        if (p1.isWin ||p2.isWin||p3.isWin){
            System.out.println("Did Player 1 win?" + p1.isWin);
            System.out.println("Did Player 2 win?" + p2.isWin);
            System.out.println("Did Player 3 win?" + p3.isWin);
            gameWon = true;
        }else {
            System.out.println("No one won.Game Starting again.");
        }
    }

}
