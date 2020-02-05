import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Human {
    Integer age = 10;

    Consumer<Integer> addYear = (x)-> age=age+10;

    public void addYearMethod(Integer a) {
        addYear.accept(a);
    }

    public void yellingAge() {
        System.out.println(age);
    }
}
