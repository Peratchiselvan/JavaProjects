/**
 * Created by Selva
 * Made with ❤ in Selvasoft
 */
public class Sentence {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multi- Tiar","30,OOO foot", "B-to-B" , "win-win" , "front-end" ,
            "web- based" , "pervasive", "smart", "six-sigma", " critical-path" , "dynamic"};
        String[] wordListTwo = { "empowered", "sticky",
                "value-added.", "oriented", "centric", "distributed",
                "clustered", "branded", "outside-the-box", "positioned",
                "networked", " focused" , "leveraged", "aligned",
                "targeted", "shared" ,"cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency" ,
                "strategy", "mindshare", "portal" , "space" , "vision",
                "paradigm", "mission"};

            int range1 = (int) (Math.random() * wordListOne.length);
            int range2 = (int) (Math.random() * wordListTwo.length);
            int range3 = (int) (Math.random() * wordListThree.length);

            System.out.println("We need " + wordListOne[range1] +" " + wordListTwo[range2]+" " + wordListThree[range3]+ ".");

    }
}
