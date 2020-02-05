package practice;

import entityJava8Book.Fibonacci;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Chapter5PracticeTest {

    Stream<String> names = Stream.of("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr11", "Pete Best11", "Stuart Sutcliffe11");
    Chapter5Practice a = new Chapter5Practice();
    Fibonacci fibonacciClass = new Fibonacci();
    Stream<String> names1 = Stream.of("John", "Paul", "George", "John", "Paul", "John");
    Map map = new HashMap() {{
        put(1, 0);
        put(2, 1);
    }};

    @Test
    void generalPracticeTest() {
        assertEquals(a.nameMeets(names1), new HashMap<String, Long>() {{
            put("John", 3L);
            put("Paul", 2L);
            put("George", 1L);
        }});
//               a.nameMeets(names1).forEach((x,y)->System.out.println(x+" "+y));
        System.out.println(a.fibonacci(map, 10));
        System.out.println(fibonacciClass.fibonacci(10));
    }

    @Test
    void getLongestNameTest1() {
        assertEquals(a.getLongestName1(names), "Stuart Sutcliffe11");
    }

    @Test
    void getLongestNameTest2() {
        assertEquals(a.getLongestName2(names), "Stuart Sutcliffe11");
    }
}