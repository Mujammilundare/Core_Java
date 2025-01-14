
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface Version 
	{
	int major() default 1;
	int minor() default 0;
	String release() default "";
}
