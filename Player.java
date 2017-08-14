/**
 * Created by Selva
 * Made with ❤ in Selvasoft
 */
public class Player {
    int number1;
    boolean isWin = false;
    void Guess(){
        number1 = (int) (Math.random() * 10);
        System.out.println("My guess is " + number1);
    }
    void win(){
        isWin = true;
    }
}
