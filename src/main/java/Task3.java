import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {


    public List<Integer> numbers(List<String> cumbersomeNumbers) {
        return cumbersomeNumbers.stream()
                .flatMap(x -> Arrays.stream(x.split(", ")))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }


}
