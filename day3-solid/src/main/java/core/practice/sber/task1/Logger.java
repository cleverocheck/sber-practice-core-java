package core.practice.sber.task1;

class Logger {
    public static void log(String message) {
        System.out.println("[" + java.time.LocalDateTime.now() + "] " + message);
    }

    public static void logError(String error) {
        System.err.println("[ERROR " + java.time.LocalDateTime.now() + "] " + error);
    }
}