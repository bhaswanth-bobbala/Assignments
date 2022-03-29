/*
 * Design and develop a Spring MVC web application as follows:
a. Design simpleInterest.jsp to capture principal amount, no. of years and rate of
interest
b. SimpleInterestController will receive these inputs and calculates simple interest.
SimpleInterestController should return a view that contains simple interest.
 */

package mvc.q2;

public class SimpleInterestController {
	double principalAmount;
	int time;
	double interestRate;

	public double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
