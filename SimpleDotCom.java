/**
 * Created by Selva
 * Made with ❤ in Selvasoft
 */
public class SimpleDotCom {
    private int[] Position;
    private int Hits;
    String Result = "Miss";

    void setPosition(int[] S){
        Position = S;
    }

    String check(String Guess){
        int UserGuess = Integer.parseInt(Guess);

        for (int number : Position){
            if (number==UserGuess){
                Result = "Hit";
                Hits++;
                break;
            }
        }
        if (Hits == Position.length){
            Result = "Hit. Game Over";
        }
        System.out.println(Result);
        return Result;
    }
}
