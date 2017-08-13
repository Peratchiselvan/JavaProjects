/**
 * Created by Selva
 * Made with ❤ in Selvasoft
 */
public class beer {
    public static void main(String[] args){
        int nos_bottle = 99;
        String name_bottle = "Bottle";
        while (nos_bottle > 0){
            System.out.println(nos_bottle + " " + name_bottle + " left");
            System.out.println("Pass it down");
            nos_bottle--;
            if (nos_bottle != 1){
                name_bottle = "Bottles";
            }
            if (nos_bottle == 0){
                System.out.println("There is no bottle left");
            }
        }
    }
}
