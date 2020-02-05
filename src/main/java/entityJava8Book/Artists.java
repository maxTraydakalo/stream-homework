package entityJava8Book;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Artists {

    private List<Artist> artists;

    public Artists(List<Artist> artists) {
        this.artists = artists;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public Optional<Artist> getArtist(int index){
        if(index >= artists.size() || index < 0){
            return Optional.empty();
        }
        return Optional.of(artists.get(index));
    }

    public String getArtistName(int index){
        return getArtist(index).map(Artist::getName).orElse("unknown");
    }
}
