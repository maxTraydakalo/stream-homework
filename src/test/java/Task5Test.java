import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void Task5Test(){
        Task5 task5 = new Task5();
//        Stream<String> anStream1 = Stream.of("a", "c", "e", "g");
//        Stream<String> anStream2 = Stream.of("b", "d", "f", "h");
        Stream<String> anStream1 = Stream.of();
        Stream<String> anStream2 = Stream.of("as");

        task5.zip(anStream1, anStream2);
    }

}