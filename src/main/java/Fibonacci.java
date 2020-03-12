
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Fibonacci {
    public static void main(String[] args) {
        String a = "as";
        String b = null;
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        System.out.println((Character[]) null);
//        System.out.println(arrayList.get(1));
//        Human human = new Human();
//        human.yellingAge();
//        human.addYearMethod(1);
//        human.yellingAge();
//        System.out.println(uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
//        System.out.println(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
//        System.out.println(uniqueOccurrences(new int[]{1, 2}));

        System.out.println(null instanceof char[]);
        System.out.println();
        Arrays.stream(constructRectangle(1)).forEach(System.out::println);
        System.out.println("hello world");
    }

    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }
        int[] array = new int[size];
        size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                array[size] = nums[i + 1];
                size++;
            }
        }
        return array;
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Set<Long> Set = new HashSet<>();
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .values()
                .stream()
                .noneMatch(x -> {
                    if (Set.contains(x))
                        return true;
                    else {
                        Set.add(x);
                        return false;
                    }
                });

    }

    public static int[] constructRectangle(int area) {
        for (int i = 1; i <= area; i++) {
            if (area % i == 0 && i >= area / i) return new int[]{i, area / i};
        }
        return null;
    }


    public static Integer fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void fibonacciStream(int n) {
        Stream.iterate(new BigInteger[]{BigInteger.ZERO, BigInteger.ONE}, x -> new BigInteger[]{x[1], x[0].add(x[1])})
                .limit(n)
                .forEach(x -> System.out.println(x[0]));
    }

    public static void downStream(int n) {
        Stream.of(1, 3, 5, 6, 7, 3, 5, 10, 5)
                .limit(n)
                .map(x -> x % 2 == 0 ? x + 1 : x)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))

                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach((x) -> System.out.println(x + ": "));
    }

    Supplier<Person> aPerson = () -> new Person(213, "ewq");
    Consumer<Optional<? extends Person>> set = g -> g.ifPresent(q -> q.setCity("dfs"));
    Function<? super Person, ? extends Person> classifier = x -> {
        x.yellingAge();
        System.out.println(x.getCity());
        return x;
    };


}
