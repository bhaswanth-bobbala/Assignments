/**Q7. There is an Array which is of the size 15, which may or may not be sorted. You should write a program to accept a number and search if it in contained in the array

Example:

5 12 14 6 78 19 1 23 26 35 37 7 52 86 47

Value to be search is 19          

Description:-

Given an array, the task is to check whether a certain element is present in this given Array or not.

Specifications-

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){}
}
public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
}**/
class SearchArray{
    public static boolean searchArray(int[] arr,int toCheckValue){
    	boolean a=false;
    	for (int i=0;i<=arr.length-1;i++) {
    		if(arr[i]==toCheckValue)
    			a=true;
    	}
    	return a;
    }
}

public class Assignment1Q7 {

	public static void main(String[] args) {
		int[] arr = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        System.out.print(SearchArray.searchArray(arr,valueToCheck));

	}

}

/**
public class Assignment1Q7 {

	public static void main(String[] args) {
		int[] arr = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        boolean a=false;
        for (int i=0;i<=arr.length-1;i++) {
    		if(arr[i]==valueToCheck)
    			a=true;
    	}
        System.out.print(a);
	}
}
**/
