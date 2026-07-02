package core.practice.sber.task1;

class DVD extends LibraryItem {
    private String director;
    private int durationMinutes;

    public DVD(String title, int year, String director, int durationMinutes) {
        super(title, year);
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    public String getDirector() {
        return director;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    @Override
    public String getDescription() {
        return "DVD: " + getTitle() + ", " + director + ", " + durationMinutes + " min";
    }
}