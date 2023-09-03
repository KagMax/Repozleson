package addnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.TYPE_USE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SuperMethods {
    boolean value() default false;

}