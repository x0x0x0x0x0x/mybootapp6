package jp.te4a.spring.boot.myapp11.mybootapp11;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import jakarta.validation.Constraint;

@Documented
@Constraint(validatedBy = TestValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@RetentionPolicy.RUNTIME)

public @interface TestValid {
    String param();
    String message() default "input other than  {param}.";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default{};
    
}
