import entityJava8Book.Album;
import entityJava8Book.Track;

import javax.swing.text.DateFormatter;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class illyaInterviewTask{
    /*
     * return equal objects from 2 array/lists
     *
     * */

    public static class Artist {
        String name;
        String bornPlace;

        public Artist(String name, String bornPlace) {
            this.name = name;
            this.bornPlace = bornPlace;
        }

        public String getName() {
            return name;
        }

        public String getBornPlace() {
            return bornPlace;
        }
    }
    BinaryOperator<Long> addExplicit = (х, у) -> х + у;
    Predicate<Integer> checkLeg = x -> x > 5;

    public List<Integer> solution(List<Integer> a, List<Integer> b) {
        return a.stream()
                .filter(x -> b.stream().anyMatch(q -> q.equals(x)))
                .collect(Collectors.toList());
    }


    public List<Integer> checkConcept() {
        return Stream.of(Arrays.asList (1, 2), Arrays.asList (3, 4))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    int addUp(Stream<Integer> numbers){
        return numbers.reduce(Integer::sum).get();
    }

    public List<String> getNameAndBornPlace(List<Artist> artists){
        return artists.stream()
                .map(artist -> artist.getName()+" "+artist.getBornPlace())
                .collect(Collectors.toList());
    }

    /*
     *concat 2 arrays and return object with duplicates
     */


    boolean check(Predicate<Integer> predicate){return true;};

    boolean check(IntPred predicate){return true;};
}

interface IntPred {
    boolean test(Integer value);


}