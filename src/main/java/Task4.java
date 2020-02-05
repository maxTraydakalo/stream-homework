import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {

    public Long linearCongruentGenerator(Long seed, Long mod, Long increment, Long multiplier, int skip) {
        return Stream.iterate(seed, (Long x) -> congruentMethod.next(x, mod, increment, multiplier))
                .limit(skip + 1)
                .skip(skip)
                .findFirst()
                .get();
    }

    public void linearCongruentGeneratorYield(Long seed, Long mod, Long increment, Long multiplier) {
        Stream.iterate(seed, (Long x) -> congruentMethod.next(x, mod, increment, multiplier))
                .forEach(System.out::println);
    }

    long pow(long base, long power) {
        long result = 1;
        for (int i = 0; i < power; i++) {
            result = result * base;
        }
        return result;
    }

    CongruentMethod congruentMethod = (Long seed, Long mod, Long increment, Long multiplier) -> {
        BigInteger s = BigInteger.valueOf(seed);
        BigInteger m = BigInteger.valueOf(mod);
        BigInteger i = BigInteger.valueOf(increment);
        BigInteger multi = BigInteger.valueOf(multiplier);
        return s.multiply(multi).add(i).mod(m).longValue();
    };

    @FunctionalInterface
    interface CongruentMethod {
        Long next(Long seed, Long mod, Long increment, Long multiplier);
    }
}
