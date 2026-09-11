import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prithee {
    private int correctLineCount;
    private int wrongLineCount;

    private final List<String> lines;

    public Prithee(List<String> lines) {
        this.lines = lines;
        this.correctLineCount = 0;
        this.wrongLineCount = 0;
    }
}
