package core.practice.sber.task1;

abstract class LibraryItem {
    private String title;
    private int year;
    private boolean isBorrowed;

    public LibraryItem(String title, int year) {
        this.title = title;
        this.year = year;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }

    public abstract String getDescription();
}
