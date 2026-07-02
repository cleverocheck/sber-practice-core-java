package core.practice.sber.task5;

//Было нарушение Dependency Injection
public class Task5 {
    public static void main(String[] args) {
        UserDIPService mySQLUserService = new UserDIPService(new MySQLDatabase());
        UserDIPService postgreSQLUserService = new UserDIPService(new PostgreSQLDatabase());

        mySQLUserService.createUser("cleverocheck");
        postgreSQLUserService.createUser("cleverocheck");
    }
}