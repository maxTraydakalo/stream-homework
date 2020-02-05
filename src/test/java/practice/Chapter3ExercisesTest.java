package practice;

import org.junit.jupiter.api.Test;
import entityJava8Book.SampleData;
import practice.Chapter3Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static entityJava8Book.SampleData.*;
import static org.junit.jupiter.api.Assertions.*;

class Chapter3ExercisesTest {
    private Chapter3Exercises a = new Chapter3Exercises();

    @Test
    void getAlbumNoMoreThan3TracksTest() {
        assertEquals(a.getAlbumNoMoreThan3Tracks(Arrays.asList( aLoveSupreme, sampleShortAlbum, manyTrackAlbum)),
                Arrays.asList(aLoveSupreme, sampleShortAlbum));
    }

    @Test
    void getTotalMembersTest(){
        assertEquals(a.getTotalMembers(Collections.singletonList(theBeatles)), 4);
    }

    @Test
    void countLowerCaseCharsTest(){
        assertEquals(a.countLowerCaseChars("aQEWsdARW"), 3);
    }

    @Test
    void getStringWithBiggestNumberLowerCaseCharsTest(){
        assertEquals(a.getStringWithBiggestNumberLowerCaseChars(Arrays.asList("AdsdfsfaserwDHFISU", "fdsafaserAWEAWE",
                "ADEWEQ", "", "asdgjdhfos uirreg hreiruei gh")), Optional.of("asdgjdhfos uirreg hreiruei gh"));
    }
}