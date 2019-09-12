package assignment1.problem2;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSpecialArtist extends AbstractArtist{
    private List<String> movies;
    private List<String> series;
    private List<String> multimedia;


    public AbstractSpecialArtist(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.movies = new ArrayList<>();
        this.series = new ArrayList<>();
        this.multimedia = new ArrayList<>();
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    public void addMovies(String movie) {
        this.movies.add(movie);
    }

    public List<String> getSeries() {
        return series;
    }

    public void setSeries(List<String> series) {
        this.series = series;
    }

    public void addSeries(String series) {
        this.movies.add(series);
    }

    public List<String> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(List<String> multimedia) {
        this.multimedia = multimedia;
    }

    public void addMultimedia(String multimedia) {
        this.movies.add(multimedia);
    }
}
