package core.practice.sber.task1;

//Было нарушение Single Responsibility
public class Task1 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        AuthService authService = new AuthService(userRepository);

        Logger.logError(String.valueOf(authService.authenticate("cleverocheck", "wrong")));
        userRepository.addUser("cleverocheck", "right");
        Logger.logError(String.valueOf(authService.authenticate("cleverocheck", "wrong")));
        Logger.log(String.valueOf(authService.authenticate("cleverocheck", "right")));
    }
}