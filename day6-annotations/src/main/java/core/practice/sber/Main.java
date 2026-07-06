package core.practice.sber;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void print(Object obj) throws InvocationTargetException, IllegalAccessException {
        Class<?> clazz = obj.getClass();

        Paint classPaint = clazz.getAnnotation(Paint.class);
        String defaultStyle = classPaint != null ? classPaint.style() : "";
        String defaultColor = classPaint != null ? classPaint.color() : "";

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.getParameterCount() == 0 && method.getReturnType() == String.class) {
                Paint methodPaint = method.getAnnotation(Paint.class);

                String style = methodPaint != null ? methodPaint.style() : defaultStyle;
                String color = methodPaint != null ? methodPaint.color() : defaultColor;

                Object result = method.invoke(obj);
                if (result != null) {
                    String styledText = PrintStyles.applyStyle(result.toString(), style);
                    System.out.println(color + styledText + PrintColors.RESET);
                }
            }
        }
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        print(new Messages());
    }
}