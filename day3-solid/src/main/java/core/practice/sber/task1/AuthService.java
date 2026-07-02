package core.practice.sber.task1;

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
