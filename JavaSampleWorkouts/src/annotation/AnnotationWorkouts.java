package annotation;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;

@Target(ANNOTATION_TYPE.METHOD)
public class AnnotationWorkouts {

    public static void main(String args[]){
        System.out.println("Annotation workouts");
    }

    public void meth1(){

    }
}
