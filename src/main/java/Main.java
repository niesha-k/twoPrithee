import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("Shall I compare thee to a summer's day?");
        lines.add("Thou art more lovely and more temperate:");
        lines.add("Rough winds do shake the darling buds of May,");
        lines.add("And summer's lease hath all too short a date;");
        lines.add("Sometime too hot the eye of heaven shines,");
        lines.add("And often is his gold complexion dimm'd;");
        lines.add("And every fair from fair sometime declines,");
        lines.add("By chance or nature's changing course untrimm'd;");
        lines.add("But thy eternal summer shall not fade,");
        lines.add("Nor lose possession of that fair thou ow'st;");
        lines.add("Nor shall death brag thou wander'st in his shade,");
        lines.add("When in eternal lines to time thou grow'st:");
        lines.add("So long as men can breathe or eyes can see,");
        lines.add("So long lives this, and this gives life to thee.");

        Prithee prithee = new Prithee((lines));
        while(prithee.stop() == false) {
            int nextLinePlease = prithee.nextLinePlease();
            int nextWordPlease = prithee.giveRandomWordFromLine(nextLinePlease);
            prithee.printAndPromptNextWord(nextLinePlease, nextWordPlease);

            System.out.print("Prithee? ");
            String response = new java.util.Scanner(System.in).nextLine();

            if(prithee.checkUserPrompted(nextLinePlease, nextWordPlease, response)){
                System.out.print("Yes! You got it!");
            } else {
                System.out.print("No, loser");
            }
            System.out.println();
        }
        if(prithee.getLinesCorrectlySaidCount() >= 3){
            System.out.print("Yippeeee!");
        } else {
            System.out.print("You suck, get out");
        }
    }
}
