public class Task5 {
    public static void main(String[] args) {
        UserService mySQLUserService = new UserService(new MySQLDatabase());
        UserService postgreSQLUserService = new UserService(new PostgreSQLDatabase());

        mySQLUserService.createUser("cleverocheck");
        postgreSQLUserService.createUser("cleverocheck");
    }
}

//Было нарушение Dependency Injection

interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {
    public void save(String data) {
        System.out.println("MySQL " + data);
    }
}

class PostgreSQLDatabase implements Database {
    public void save(String data) {
        System.out.println("PostgreSQL " + data);
    }
}

class UserService {
    private final Database database;

    UserService(Database database) {
        this.database = database;
    }

    public void createUser(String username) {
        database.save("User: " + username);
    }
}