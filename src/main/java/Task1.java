import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {

    public String filterOddIndexNames1(ArrayList<String> names) {
        return IntStream.range(0, names.size())
                .filter(x -> x % 2 == 1)
                .mapToObj(x -> x + ". " + names.get(x))
                .collect(Collectors.joining(", "));
        //"masha", "masha","masha","masha","masha" - wrong output
    }
}
