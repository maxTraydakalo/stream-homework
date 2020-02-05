import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void numbersTest(){
        Task3 task3 = new Task3();
        List<String> cumbersomeNumbers = Arrays.asList("1, 2, 0", "4, 5");
        List<Integer> expected = Arrays.asList(1, 2, 0, 4, 5);
        assertEquals(task3.numbers(cumbersomeNumbers), expected);


    }

}