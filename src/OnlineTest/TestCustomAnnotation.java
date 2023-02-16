package OnlineTest;

//Creating annotation
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    int value();
}

// Applying annotation
class Hello2 {
    @MyAnnotation(value = 10)
    public void sayHello() {
        System.out.println("hello annotation");
    }
}

// Accessing annotation
class TestCustomAnnotation {
    public static void main(String args[]) throws Exception {

        Hello2 h = new Hello2();
        Method m = h.getClass().getMethod("sayHello");

        MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
        System.out.println("value is: " + manno.value());
    }
}