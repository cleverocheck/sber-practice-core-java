package core.practice.sber.task4;

class Author {
    private String name;
    private boolean isMale;
    private String email;

    Author(String name, boolean isMale, String email) {
        this.name = name;
        this.isMale = isMale;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }
    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String value) {
        this.email = value;
    }

    @Override
    public String toString() {
        return name + " " + isMale + " " + email;
    }
}