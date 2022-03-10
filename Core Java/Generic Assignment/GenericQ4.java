/**
 * Design a class named Pair which has two properties. The name of the first property is key
and that of the second property is value. When designing the class take case of the following
scenarios:
a. Create an Object of Pair class to store String value for the property key and String
value for the property value. Restriction Apart from String type no other types should
be acceptable as Key or value input
e.g.
 myObj.setKey(“1”);
 myObj.setValue(“Hello”);
b. Create an object of the class Pair to store String value for the property key and
java.util.Date as value for the property value
myObj.setKey(“Today is”);
myObj.setValue(new java.util.Date());
Note: In scenario a. no data apart from String should be used for key and value, in scenario b.
no data apart from String for key and java.util.Date should be allowed 
 * @author Manindra
 *
 * @param <K>
 * @param <V>
 */

class Generic1<K,V>{
	K keyK;
	V value;
	public K getKey() {
		return keyK;
	}
	public void setKey(K keyK) {
		this.keyK = keyK;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}
public class GenericQ4 {
	public static void main(String[] args) {
		Generic1<String, String> obj1 = new Generic1<>();
		obj1.setKey("1");
		obj1.setValue("Hello"); 
		Generic1<String,java.util.Date> obj2 = new Generic1<>();
		obj2.setKey("Today is");
		obj2.setValue(new java.util.Date()); 
		System.out.println(obj1.getKey());
		System.out.println(obj1.getValue());
		System.out.println(obj2.getKey()+ obj2.getValue());

	}

}
