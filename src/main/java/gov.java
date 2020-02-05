import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

public class gov {

    public Boolean check(Integer i, Integer arr[]) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
        return i % 2 == 1 ? hashSet.stream().anyMatch(x -> hashSet.contains(i - x) && x != i / 2)
                : hashSet.contains(i / 2) && Stream.of(arr).filter(x -> x == i / 2).count() > 1;
    }
}
