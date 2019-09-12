package assignment1.problem2;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractArtist {

    private String firstName;
    private String lastName;
    private int age;
    protected String generes;
    private List<String> Awards;


    public AbstractArtist(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.generes = generes;
        Awards = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGeneres() {
        return generes;
    }

    public List<String> getAwards() {
        return Awards;
    }

    public void setAwards(List<String> awards) {
        Awards = awards;
    }

    public void addAwards(String award){
        this.Awards.add(award);
    }
}
