package assignment1.problem3;

import assignment1.problem3.exceptions.ImpactEstimationException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class AbstractPublication {
    private String title;
    private List<String> authors;
    private Integer publishingYear;
    private Integer numOfCitations;
    private int multiplier;
    private int freshBumper;

    public AbstractPublication(String title, Integer publishingYear, Integer numOfCitations) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.publishingYear = publishingYear;
        this.numOfCitations = numOfCitations;
        this.multiplier = 1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthors(String author){
        this.authors.add(author);
    }

    public Integer getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Integer getNumOfCitations() {
        return numOfCitations;
    }

    public void setNumOfCitations(Integer numOfCitations) {
        this.numOfCitations = numOfCitations;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    private int getCurrentYear(){
        Calendar calOne = Calendar.getInstance();
        int year = calOne.get(Calendar.YEAR);
        return year;
    }

    public double estimateImpact() throws ImpactEstimationException {
        if((getCurrentYear() - this.publishingYear) > 250){
            throw new ImpactEstimationException("Impact Estimation Not Available For Old Publications !!!");
        }else{
            return getBaseImpact() * this.multiplier + this.freshBumper;
        }
    }

    public double getBaseImpact(){

        double diff = getYearDiff();
        return diff/this.numOfCitations;
    }

    private int getYearDiff(){
        int currentYear = getCurrentYear() ;
        return currentYear - this.publishingYear == 0 ? 1 : currentYear - this.publishingYear;
    }

    public boolean hasFreshBumper(){
        if(getYearDiff() < 3){
            return true;
        }
        return false;
    }

}
