import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class illyaInterviewTaskTest {

    @Test
    public void solutionTest() {
        illyaInterviewTask a = new illyaInterviewTask();
        List list1 = Arrays.asList(1, 3, 5, 4, 6, 7, 8, 9, 10);
        List list2 = Arrays.asList(1, 2, 3);
        List expected = Arrays.asList(1, 3);
        assertEquals(a.solution(list1, list2), expected);
    }

    @Test
    public void checkConceptTest() {
        illyaInterviewTask a = new illyaInterviewTask();
        assertEquals(Arrays.asList(1, 2, 3, 4), a.checkConcept());
    }

    @Test
    public void addUpTest() {
        illyaInterviewTask a = new illyaInterviewTask();
        assertEquals(a.addUp(Stream.of(1, 2, 3, 4, 5)), 15);
    }


    @Test
    public void getNameAndBornPlaceTest() {
        illyaInterviewTask a = new illyaInterviewTask();
        assertEquals(a.getNameAndBornPlace(Arrays.asList(new illyaInterviewTask.Artist("max", "kazatin"),
                new illyaInterviewTask.Artist("igor", "neped"))),
                Arrays.asList("max kazatin", "igor neped"));
    }
}