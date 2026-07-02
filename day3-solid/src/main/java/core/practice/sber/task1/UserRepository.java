package core.practice.sber.task1;

class UserRepository {
    private final java.util.Map<String, String> users = new java.util.HashMap<>();

    public void addUser(String username, String password) {
        users.put(username, password);
    }

    java.util.Optional<String> findPassword(String username) {
        return java.util.Optional.ofNullable(users.get(username));
    }
}
