package Exercise3;

public class JournalPaper extends WrittenItem{
	protected int yearPublished;

    public JournalPaper(int id, String title, int copies, String authorName, String publicationName, int noOfPages,
                        int yearPublished) {
        super(id,title,copies,authorName,publicationName,noOfPages);
        this.yearPublished=yearPublished;
        
        
    }

    @Override
    String print() {
        return ("JournalPaper [yearPublished=" + yearPublished + ", authorName=" + authorName
                + ", publicationName=" + publicationName + ", noOfPages=" + noOfPages + ", id=" + id + ", title="
                + title + ", copies=" + copies + "]");

    }

    public int getYearPublished() {
        return this.yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished=yearPublished;
    }

    public JournalPaper() {
        super();
        yearPublished=2000;
    }
}