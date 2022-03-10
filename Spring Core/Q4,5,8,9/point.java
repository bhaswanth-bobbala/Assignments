package ques4_5_8_9.spring.assignment;


public class point {
	int x;
	int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void destroy() throws Exception {
		System.out.println("Points Destroyed");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Points Created");
	}
	
	
	
}
