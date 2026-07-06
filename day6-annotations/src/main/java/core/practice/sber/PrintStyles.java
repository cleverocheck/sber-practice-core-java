package core.practice.sber;

public class PrintStyles {
    public static String applyStyle(String text, String style) {
        return switch (style) {
            case "arrow" -> "--> " + text + " <--";
            case "hurray" -> "^^^^ " + text + " ^^^^";
            case "!" -> "!!! " + text + " !!!";
            default -> text;
        };
    }
}