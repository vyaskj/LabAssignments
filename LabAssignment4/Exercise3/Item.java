package Exercise3;

abstract class Item {
	protected int id;
    protected String title;
    protected int copies;

    abstract String print();

    public Item(int id, String title, int copies) {
        super();
        this.id=id;
        this.title=title;
        this.copies=copies;
    }

    public Item() {
        id=0;
        title="";
        copies=0;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public int getCopies() {
        return this.copies;
    }

    public void setCopies(int copies) {
        this.copies=copies;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", title=" + title + ", copies=" + copies + "]";
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
    if(obj == null)
        return false;
    if(obj == this)
        return true;
    boolean b = (this.getId()== ((Item) obj).getId()) && (this.getTitle() == ((Item) obj).getTitle()) && (this.getCopies() == ((Item) obj).getCopies());
        return b;
    }
}