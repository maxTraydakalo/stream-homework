import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void Task4CongruentMethodTest() {
        Task4 task4 = new Task4();
        assertEquals(task4.congruentMethod.next(10L, task4.pow(2, 48), 11L, 25214903917L).longValue(), 252149039181L);
        assertEquals(task4.congruentMethod.next(100L, task4.pow(2, 48), 11L, 25214903917L).longValue(), 2521490391711L);
        assertEquals(task4.congruentMethod.next(5L, 100L, 11L, 2L).longValue(), 21L);
        assertEquals(task4.congruentMethod.next(50L, 100L, 11L, 2L).longValue(), 11L);
        assertEquals(task4.congruentMethod.next(5L, 100L, 11L, 101L).longValue(), 16L);
    }

    @Test
    void Task4linearCongruentGeneratorTest() {
        Task4 task4 = new Task4();
        assertEquals(task4.linearCongruentGenerator(252149039181L, task4.pow(2, 48), 0L, 252149039181L, 2).longValue(), 274287806248789L);
        assertEquals(task4.linearCongruentGenerator(100L, task4.pow(2, 48), 11L, 25214903917L, 2).longValue(), 27518018123710L);
        assertEquals(task4.linearCongruentGenerator(100L, task4.pow(2, 48), 11L, 25214903917L, 3).longValue(), 24542189924337L);
        System.out.println();
    }

    @Test
    void Task4LongPowTest() {
        Task4 task4 = new Task4();
        assertEquals(task4.pow(2, 10), 1024);
        assertEquals(task4.pow(3, 3), 27);
        assertEquals(task4.pow(2, 48), 281474976710656L);
    }


    @Test
    void Task4YieldTest() {
        Task4 task4= new Task4();
        task4.linearCongruentGeneratorYield(100L, 222222222222L, 213L, 321421421L);
    }
}