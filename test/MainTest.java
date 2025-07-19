import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    static int totalScore = 0;

    @Test
    public void testConstructorExists() {
        try {
            Class<?> clazz = Class.forName("Student");
            clazz.getConstructor(String.class, int.class, char.class);
            System.out.println("✅ Constructor with parameters exists → 5 points");
            totalScore += 5;
        } catch (Exception e) {
            System.out.println("❌ Constructor not found → 0 points");
            fail("Constructor with parameters not found in class Student.");
        }
    }

    @Test
    public void testDisplayMethodExists() {
        try {
            Class<?> clazz = Class.forName("Student");
            clazz.getMethod("displayDetails");
            System.out.println("✅ Method 'displayDetails()' exists → 5 points");
            totalScore += 5;
        } catch (Exception e) {
            System.out.println("❌ Method 'displayDetails()' not found → 0 points");
            fail("Method 'displayDetails()' not found.");
        }
    }

    @Test
    public void printTotalScore() {
        System.out.println("🏁 Total Score: " + totalScore + " / 10");
    }
}
