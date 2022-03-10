package ques10.spring.assiggnmnet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Ques10.xml");
		ApplicationContextAwareTest appcontext= (ApplicationContextAwareTest)context.getBean("appcontext");
		ApplicationContext appCon =appcontext.getContext();
		Employee a= (Employee)appCon.getBean("testA");
		a.doTask();
		context.registerShutdownHook();
	}
}
