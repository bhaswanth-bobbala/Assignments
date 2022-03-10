package ques4_5_8_9.spring.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value= {"ques4_5_8_9.spring.assignment"})
public class Circle implements Shape {
	point center;
	

	public void setCenter(point center) {
		this.center = center;
	}


	@Bean(name = "pointA")
	public point getCenter() {
		return center;
	}
	
	public void draw() {
		System.out.println("Drawing Circle at point : "+getCenter().getX()+","+getCenter().getY()+"\n");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Circle Bean Destroyed");
		
	}


	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("Circle Bean Initialization");
	}
	

}
