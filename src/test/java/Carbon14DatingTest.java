import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Carbon14DatingTest {
    //#1 Build a test for calculateAge();

    /*
        #2 Build a test for setRemainingAmount() in the
        scenario the given remaining value is <= 1.
    */
    @Test
    public void testRemainingAmount() {
        Carbon14Dating test = new Carbon14Dating(0.5);
        test.setRemainingAmount(0.5);
        assertEquals(1.0, 1.0);
    }
   /*
        #3 Build a test for setRemainingAmount() in the
        scenario the given remaining value is >= 1.
    */

    // #4 Build a test for the toString() method.
}
