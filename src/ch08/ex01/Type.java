package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 사용자 어노테이션 만들기
// 인터페이스앞에 @붙이기
@Retention(RetentionPolicy.SOURCE) // 자바파일에만 있겠따 class x
@Target(ElementType.TYPE)
public @interface Type {
	String name();

	int value();
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
@interface Field {
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface Constructor {
	int value() default 0;
}

// Retention 기본값은 CLASS다
@Target(ElementType.METHOD)
@interface Method {

}

@Target(ElementType.PARAMETER)
@interface Param {

}

@Target(ElementType.LOCAL_VARIABLE)
@Annotation
@interface Local {

}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation{
	
}

@Target({ElementType.TYPE, ElementType.FIELD})
@interface Universal{
	
}