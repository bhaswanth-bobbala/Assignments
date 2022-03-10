package ques4_5_8_9.spring.assignment;

import javax.inject.Inject;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Triangle implements Shape,InitializingBean,DisposableBean{
	@Inject
	private point pointA;
	private point pointB;
	private point pointC;
	
	public point getPointA() {
		return pointA;
	}
	
	public void setPointA(point pointA) {
		this.pointA = pointA;
	}
	public point getPointB() {
		return pointB;
	}
	@Autowired
	public void setPointB(point pointB) {
		this.pointB = pointB;
	}
	public point getPointC() {
		return pointC;
	}
	@Autowired
	public void setPointC(point pointC) {
		this.pointC = pointC;
	}
	public void draw() {
		System.out.println("Triangle points: ");
		System.out.println("PointA at ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("PointB at ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("PointC at ("+getPointC().getX()+","+getPointC().getY()+")\n");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Triangle Bean Destroyed");
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Triangle Bean Initialization");
	}
	
}



