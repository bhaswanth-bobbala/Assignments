import java.util.Arrays;

/**Q2. Find out all the Armstrong numbers falling in the range of 100-999

Description :-

An Armstrong number of three digits is an integer, where the sum of the cubes of its digits is equal to the number itself.

Consider the example: 371=> 3^3 + 7^3 + 1^3 = 371 ( If you add those all numbers, the final digit should be same as given number ).

Find the Armstrong numbers between 100 to 999.

Test cases:      

              Output : 153 370 371 407       

Specifications:
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){}
}
**/
/**
public class ArmstrongNumBetweenRange {

	public static void main(String[] args) {
		for (int i=100;i<=999;i++) {
			String a[]=String.valueOf(i).split("");
			int b=0;
			for (int j=0;j<a.length;j++) {
				b += (int)Math.pow(Integer.parseInt(a[j]), 3);
			}
			if(i==b)
				System.out.println(i);
		}

	}

}
**/
class ArmstrongNumBetweenRange {
	public int[] armstrongNumbersInRange(int min , int max){
    	int z[]= new int[4],x=0;
    	for (int i=100;i<=999;i++) {
    		int b=0;
			String a[]=String.valueOf(i).split("");
			for (int j=0;j<a.length;j++) {
				b += (int)Math.pow(Integer.parseInt(a[j]), 3);
				
			}
			if(i==b) {
				z[x]=b;
				x=x+1;
			}
    	}
    	return z;
    }
}

class Assignment1Q2{
    	
    public static void main(String[] args) {
    	int max=999;
    	int min=100;
    	ArmstrongNumBetweenRange armstrongNumBetweenRange =new ArmstrongNumBetweenRange();
    	int[] arr = armstrongNumBetweenRange.armstrongNumbersInRange(min, max);
    	System.out.print(Arrays.toString(arr));
    	
    }
}