/**
 * Created by Selva
 * Made with ❤ in Selvasoft
 */
public class SimpleDotComTest {
    public static void main(String[] args) {
        SimpleDotCom Game = new SimpleDotCom();
        GameHelper helper = new GameHelper();
        boolean isAlive = true;
        int noOfGuess = 0;
        int rand = (int) (Math.random() * 5);
        int[] guess = {rand, rand +1,rand +2};
        Game.setPosition(guess);

        while (isAlive){
            String g = helper.getUserInput("Enter your Number:");
            String result = Game.check(g);
            if (result == "Hit. Game Over"){
                isAlive =false;
            }
            noOfGuess++;
        }
        System.out.println("You predicted in " + noOfGuess + " Guesses");

    }
}
