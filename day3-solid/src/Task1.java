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

//Было нарушение Single Responsibility

class UserRepository {
    private final java.util.Map<String, String> users = new java.util.HashMap<>();

    public void addUser(String username, String password) {
        users.put(username, password);
    }

    java.util.Optional<String> findPassword(String username) {
        return java.util.Optional.ofNullable(users.get(username));
    }
}

class AuthService {
    private final UserRepository userRepository;

    AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    boolean authenticate(String username, String password) {
        return userRepository.findPassword(username)
                .map(realPassword -> realPassword.equals(password))
                .orElse(false);
    }
}

class Logger {
    public static void log(String message) {
        System.out.println("[" + java.time.LocalDateTime.now() + "] " + message);
    }

    public static void logError(String error) {
        System.err.println("[ERROR " + java.time.LocalDateTime.now() + "] " + error);
    }
}