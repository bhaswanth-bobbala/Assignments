package ques4_5_8_9.spring.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Square implements Shape{
	private point pointA;
	private point pointB;
	private point pointC;
	private point pointD;
	
	public point getPointD() {
		return pointD;
	}
	@Resource
	public void setPointD(point pointD) {
		this.pointD = pointD;
	}
	public point getPointA() {
		return pointA;
	}
	@Autowired
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
		System.out.println("Square Points :");
		System.out.println("PointA at ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("PointB at ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("PointC at ("+getPointC().getX()+","+getPointC().getY()+")");
		System.out.println("PointD at ("+getPointD().getX()+","+getPointD().getY()+")\n");
	}
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Square Bean Destroyed");
		
	}


	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("Square Bean Initialization");
	}
	
	
	
}

