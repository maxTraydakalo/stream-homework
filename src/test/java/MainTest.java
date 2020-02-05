import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mergeTest() {
        Main ma = new Main();
        int [] check = ma.merge(new int[]{-1,0,0,3,3,3,0,0,0}, 6 ,new int [] {1,2,2},3);
        int [] expected = new int[]{-1, 0, 0, 1, 2, 2, 3, 3, 3};
        for (int i = 0; i < 6; i++) {
            assertEquals(check[i], expected[i]);
        }
    }

    @Test
    void mergeTest1() {
        Main ma = new Main();
        int [] check = ma.merge(new int[]{4,5,6,0,0,0}, 3 ,new int [] {1,2,3},3);
        int [] expected = new int[]{1,2,3,4,5,6};
        for (int i = 0; i < 6; i++) {
            assertEquals(check[i], expected[i]);
        }
    }

    @Test
    void mergeTest2() {
        Main ma = new Main();
        int [] check = ma.merge(new int[]{1,2,2,0,0,0}, 3 ,new int [] {1,2,3},3);
        int [] expected = new int[]{1,1,2,2,2,3};
        for (int i = 0; i < 6; i++) {
            assertEquals(check[i], expected[i]);
        }
    }

    @Test
    void mergeTest3() {
        Main ma = new Main();
        int [] check = ma.merge(new int[]{1,2,3,0,0,0}, 3 ,new int [] {2,5,6},3);
        int [] expected = new int[]{1,2,2,3,5,6};
        for (int i = 0; i < 6; i++) {
            assertEquals(check[i], expected[i]);
        }
    }
}
