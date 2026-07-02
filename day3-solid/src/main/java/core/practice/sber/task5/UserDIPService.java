package core.practice.sber.task5;

class UserDIPService {
    private final Database database;

    UserDIPService(Database database) {
        this.database = database;
    }

    public void createUser(String username) {
        database.save("User: " + username);
    }
}