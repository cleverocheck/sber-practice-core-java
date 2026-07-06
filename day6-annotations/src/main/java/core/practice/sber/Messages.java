package core.practice.sber;

@Paint(style = "arrow", color = PrintColors.RED)
public class Messages {
    @Paint(style = "hurray", color = PrintColors.PURPLE)
    public String happyBirthday() {
        return "С днём рождения!";
    }
    
    @Paint(style = "!", color = PrintColors.YELLOW)
    public String warning() {
        return "Предупреждение";
    }
    
    public String error() {
        return "Ошибка";
    }
}