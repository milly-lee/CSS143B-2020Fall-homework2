package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.rating = rating;
        this.title = title;
        this.id = UUID.randomUUID();
    }

    public Movie(Movie anotherMovie) {
        rating = anotherMovie.rating;
        title = anotherMovie.title;
        id = anotherMovie.id;
    }

    @Override
    public boolean equals(Object obj) {
        Movie m = (Movie) obj;
        return rating == m.rating && title == m.title && id == m.id;
    }
}
