package assignment1.problem3;

import java.util.ArrayList;
import java.util.List;

public class Journal extends Article {

    private String publisher;
    private List<String> editors;


    public Journal(String title, Integer publishingYear, Integer numOfCitations) {
        super(title, publishingYear, numOfCitations);
        super.setMultiplier(2);
        this.editors = new ArrayList<>();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<String> getEditors() {
        return editors;
    }

    public void setEditors(List<String> editors) {
        this.editors = editors;
    }

    public void addEditors(String editor){
        this.editors.add(editor);
    }
}
