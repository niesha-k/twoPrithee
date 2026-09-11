import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Prithee {
    private int linesCorrectlySaidCount;
    private int linesWronglySaidCount;

    private final List<String> lines;

    private Random random;

    public Prithee(List<String> lines) {
        this.lines = lines;
        this.linesCorrectlySaidCount = 0;
        this.linesWronglySaidCount = 0;
        this.random = new Random();
    }

    public int nextLinePlease(){
        return random.nextInt(lines.size());
    }

    public int giveRandomWordFromLine(int indexofLine){
        String[] wordsFromLine = lines.get(indexofLine).split(" ");
        return random.nextInt(wordsFromLine.length);
    }

    public void printAndPromptNextWord(int whatsMyNextLine, int whatsMyNextWord){
        for(int indexofLine = 0; indexofLine < lines.size(); indexofLine++){
            String[] splitLine = lines.get(indexofLine).split(" ");

            for(int indexofWord = 0; indexofWord < splitLine.length; indexofWord++){

                if(indexofLine == whatsMyNextLine && indexofWord == whatsMyNextWord){
                    for(int indexOfLetter = 0; indexOfLetter < splitLine[indexofWord].length(); indexOfLetter++){
                        System.out.print("_");
                    }
                } else {
                    System.out.print((splitLine[indexofWord]));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
