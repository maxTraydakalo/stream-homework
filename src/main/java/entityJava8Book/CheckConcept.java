package entityJava8Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

public class CheckConcept implements Callable {
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }


    public static String tryCatchCheck() {


        try {
            return "try";
        } catch (Throwable a) {
            return "catch";
        } finally {
            return "finally";
        }

    }

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        List<Integer> b = new ArrayList<>();
        hashMap.put(null, 1);
        hashMap.put(null, 223131);
        hashMap.put(null, 3);
        CheckConcept task = new CheckConcept();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        final Future<Integer> division = executorService.submit(() -> 1 / 0);
//ниже будет выброшено ExecutionException, вызванное ArithmeticException


    }

    @Override
    public Integer call() throws Exception {
        return 5 * 8;
    }
}
