package core.practice.sber;

//import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
//        Example example = new Example();
//        for (Annotation annotation : example.getClass().getAnnotations()) System.out.println(annotation);
//        System.out.println(example.getClass().isAnnotationPresent(RuntimeMethodAnnotation.class));

        FooBar fooBar = new FooBar();
        for(Method method: fooBar.getClass().getMethods()) {
            if(method.isAnnotationPresent(Run.class)) method.invoke(fooBar);
        }
    }
}