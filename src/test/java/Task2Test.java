import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void uppercaseDescendingListTest() {
        ArrayList<String> names = new ArrayList(
                Arrays.asList("Alex", "Markian", "Charles", "Andrew", "James"));

        ArrayList<String> expected = new ArrayList(
                Arrays.asList("MARKIAN", "JAMES", "CHARLES", "ANDREW", "ALEX"));
        Task2 task2 = new Task2();
        assertEquals(task2.uppercaseDescendingList(names), expected);
    }

}