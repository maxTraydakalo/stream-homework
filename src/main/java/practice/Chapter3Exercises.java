package practice;

import entityJava8Book.Album;
import entityJava8Book.Artist;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Chapter3Exercises {

    public List<Album> getAlbumNoMoreThan3Tracks(List<Album> albums) {

        return albums.stream()
                .filter(x -> x.getTracks().count() < 4)
                .collect(Collectors.toList());
    }

    public int getTotalMembers(List<Artist> artists) {
        return (int) artists.stream()
                .flatMap(Artist::getMembers)
                .count();
    }

    public int countLowerCaseChars(String string) {
        return (int) string.chars()
                .filter(Character::isLowerCase)
                .count();
    }

    public Optional<String> getStringWithBiggestNumberLowerCaseChars(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparingLong(x -> x.chars()
                        .filter(Character::isLowerCase)
                        .count()));
    }

}
