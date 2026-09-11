import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PritheeTest {
    private List<String> createSampleLines() {
        List<String> lines = new ArrayList<>();

        lines.add("Hello Hello");
        lines.add("Hello Hello Hello Hello");
        lines.add("Hello");

        return lines;
    }

    @Test
    public void stopsAfterThreeCorrectAnswers() {
        Prithee prithee = new Prithee(createSampleLines());

        prithee.checkUserPrompted(0, 0, "Hello");
        prithee.checkUserPrompted(0, 0, "Hello");
        prithee.checkUserPrompted(0, 0, "Hello");

        assertTrue(prithee.stop());
    }

    @Test
    public void stopsAfterThreeWrongAnswers() {
        Prithee prithee = new Prithee(createSampleLines());

        prithee.checkUserPrompted(0, 0, "Wrong");
        prithee.checkUserPrompted(0, 0, "Wrong");
        prithee.checkUserPrompted(0, 0, "Wrong");

        assertTrue(prithee.stop());
    }
}