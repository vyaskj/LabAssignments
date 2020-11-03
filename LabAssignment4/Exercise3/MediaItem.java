package Exercise3;

abstract public class MediaItem extends Item{
	protected int yearOfRelease;
    protected String genre;

    public MediaItem(int id, String title, int copies, int yearOfRelease, String genre) {
        super(id,title,copies);
        this.yearOfRelease=yearOfRelease;
        this.genre=genre;
    }

    public MediaItem() {
        super();
        yearOfRelease=2000;
        genre="";

    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease=yearOfRelease;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre=genre;
    }

    @Override
    public String print() {
        //super.print();
        return("yearOfRelease"+this.yearOfRelease+"String genre: "+this.getGenre());
    }
}