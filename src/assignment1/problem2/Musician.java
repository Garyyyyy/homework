package assignment1.problem2;

public class Musician extends AbstractArtist{

    public Musician(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.generes = "Musician";
    }
}
