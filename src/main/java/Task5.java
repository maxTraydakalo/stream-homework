import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Task5 {
    //peek​(Consumer action)
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> secondIter = second.iterator();
        return first.flatMap(x -> secondIter.hasNext() ? Stream.of(x, secondIter.next()) : Stream.empty());

    }
//1,3,5
    //2,4

}
