import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println();
    }

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < nums1.length; i++, j++) {
            nums1[i] = nums2[j];
        }
       return nums1;
    }


}
