package assignment1.problem3;

public class ConferenceProceeding extends Article {

    private String conferenceName;
    private String conferenceLocation;

    public ConferenceProceeding(String title, Integer publishingYear, Integer numOfCitations) {
        super(title, publishingYear, numOfCitations);
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public String getConferenceLocation() {
        return conferenceLocation;
    }

    public void setConferenceLocation(String conferenceLocation) {
        this.conferenceLocation = conferenceLocation;
    }
}
