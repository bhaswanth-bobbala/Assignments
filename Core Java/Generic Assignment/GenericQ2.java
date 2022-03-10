/**
 * Write an application to hold 10 random int values as keys and 10 random double values as
values for a HashMap. Print the data store in the HashMap. Note: Keys can only be int and
values double 
 */


import java.util.HashMap;

public class GenericQ2 {

	public static void main(String[] args) {
		HashMap<Integer, Double> hashMap = new HashMap<>();
		hashMap.put(1,20.0);
		hashMap.put(2,21.0);
		hashMap.put(3,22.0);
		hashMap.put(4,23.0);
		hashMap.put(5,24.0);
		hashMap.put(6,25.0);
		hashMap.put(7,26.0);
		hashMap.put(8,27.0);
		hashMap.put(9,28.0);
		hashMap.put(10,29.0);
		System.out.println(hashMap);

	}

}
