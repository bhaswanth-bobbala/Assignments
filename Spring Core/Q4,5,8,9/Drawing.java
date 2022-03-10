/*
 * 4) Example on @Controller, @Service, @Repository, @Autowired, @Configuration and
	@Bean
	Modify the above application, use annotations and java based configuration.
*  5) Write a program to demonstrate use of @Resource, @Inject, @Required annotations
*  8) Write a Java program to demonstrate InitializingBean and DisposableBean.
	Try Different ways:
	(Use init-method and destroy-method in xml config file)
	(Use @PostConstruct and @PreDestroy)
*9) Write a Java program to demonstrate Complete Bean Life cycle. 
 */

package ques4_5_8_9.spring.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
	public static void main(String[] arg) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Ques4_5_8_9.xml");
		context.registerShutdownHook();
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.draw();
		
		Square square=(Square)context.getBean("square");
		square.draw();
		
		Line line=(Line)context.getBean("line");
		line.draw();
		
		context.close();
	}

}
