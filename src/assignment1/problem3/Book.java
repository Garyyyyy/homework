package assignment1.problem3;

public class Book extends AbstractPublication {

    private String publishingCompany;
    private Integer numOfPages;

    public Book(String title, Integer publishingYear, Integer numOfCitations) {
        super(title, publishingYear, numOfCitations);
        super.setMultiplier(4);
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public Integer getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(Integer numOfPages) {
        this.numOfPages = numOfPages;
    }

}
