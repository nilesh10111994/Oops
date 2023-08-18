package Annotations;

import java.lang.annotation.Documented;

@Documented
public @interface ClassPreamble {
    String Author();
    String date();
    int version() default 1;
    String [] reviewers();
}
