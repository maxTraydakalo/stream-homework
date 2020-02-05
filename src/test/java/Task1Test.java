import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void filterOddIndexNamesTest() {
        ArrayList<String> names = new ArrayList(
                Arrays.asList("Alex", "Markian", "Charles", "Andrew", "James"));

        Task1 task1 = new Task1();
        assertEquals(task1.filterOddIndexNames1(names), "1. Markian, 3. Andrew");
    }
}