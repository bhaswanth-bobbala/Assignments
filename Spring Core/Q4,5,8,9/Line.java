package ques4_5_8_9.spring.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

@Service
public class Line implements Shape {
	private point pointA;
	private point pointB;
	public point getPointA() {
		return pointA;
	}
	@SuppressWarnings("deprecation")
	@Required
	public void setPointA(point pointA) {
		this.pointA = pointA;
	}
	public point getPointB() {
		return pointB;
	}
	@Required
	public void setPointB(point pointB) {
		this.pointB = pointB;
	}
	@Override
	public void draw() {
		System.out.println("Line points: ");
		System.out.println("PointA at ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("PointB at ("+getPointB().getX()+","+getPointB().getY()+")\n");
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Line Bean Destroyed");
		
	}


	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("Line Bean Initialization");
	}

	
}
