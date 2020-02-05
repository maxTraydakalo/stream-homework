package practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter5Practice {


    public String getLongestName1(Stream<String> namesStream) {
        return namesStream.reduce((x, y) -> x.length() > y.length() ? x : y).get();
    }

    public String getLongestName2(Stream<String> namesStream) {
        return namesStream.max(Comparator.comparingInt(String::length)).get();
    }

    public Map<String, Long> nameMeets(Stream<String> nameStream) {
        return nameStream.collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
    }

    public Integer fibonacci(Map<Integer, Integer> fibonacci, int number) {
        if (!fibonacci.containsKey(number - 1)) {
            fibonacci(fibonacci, number - 1);
        }
        return fibonacci.computeIfAbsent(number, fibonacciNumber -> fibonacci.get(number - 1) + fibonacci.get(number - 2));
    }

}
