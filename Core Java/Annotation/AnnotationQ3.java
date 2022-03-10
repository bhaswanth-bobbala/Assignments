/**
 * Create a custom annotation called @Execute to be applied on methods. Placing the
@Execute method on a method implies that method should be invoked using Reflection API
(Invoking the method using Reflection API is out of scope of this assignments). The
annotation @Execute should have an optional property “sequence” which can be given
values such as 1, 2, 3… in the order of priority. In case the sequence property is not used the
API may invoke methods in random order.
E.g.
Class MyClass{
@Execute(Sequence=2)
Public void myMethod1(){
}
@Execute(Sequence=1)
Public void myMethod2(){
}
@Execute(Sequence=3)
Public void myMethod3(){
}
}
Note: The above annotation tells the system that the invocation should be in the order:
myMethod2 first, followed by myMethod1 and finally myMethod3 
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface  Execute{
 	public int Sequence() default 1;
}


class MyClass{
	@Execute(Sequence=2)
	public void myMethod1(){
		System.out.println("Method 1 invoked");
	}
	
	@Execute(Sequence=1)
	public void myMethod2(){
		System.out.println("Method 2 invoked");
	}
	@Execute(Sequence=3)
	public void myMethod3(){
		System.out.println("Method 3 invoked");
	}
	
}
public class AnnotationQ3 {

	public static void main(String[] args) {
		MyClass objClass =new MyClass();
		try {
            Class<MyClass> annotatedClass = MyClass.class;
            Method[] methods = annotatedClass.getDeclaredMethods();
            for(int i=1;i<=methods.length;i++) {
	            for (Method method : methods) {
	               if (method.isAnnotationPresent(Execute.class)) {
	                  Execute sequence = method.getAnnotation(Execute.class);
	                  int num = sequence.Sequence();
	                  if (num==i) {
	                	  method.invoke(objClass);
	                     }
	               }
	            }
            }
         } catch (Exception e) {
            
         }
	}

}