/**
 * Q6. Write an abstract class ‘Persistence’ along with two sub classes ‘FilePersistence’ & ‘DatabasePersistence’. The base class with have an abstract method persist() which will be overridden by its sub classes. Write a client who gets the Persistence object at runtime & invokes persist() method on it without knowing whether data is being saved in File or in Database.

Description:-

Write a program having an abstract class "Persistence" which have two child classes "FilePersistence","DatabasePersistence".The base class will have a persist() method and it is overridden by sub classes.wite a seperate class of client which will get persistence object and invoke persist method on it.(Polymorphism)

Specifications:

abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {}
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {}
}

public class Assignment2Q6 {
    public static void main(String[] args) {}
}


 * @author Manindra
 *
 */
abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "This is FilePersistance";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "This is DatabasePersistance";
    }
}
class Client{
	 

	public static Persistence getPersistence() {
		if(Math.random()*10>5)
			return new FilePersistence();
		else {
			return new DatabasePersistence();
		}
	}
	
}
public class Assignment2Q6 {
    public static void main(String[] args) {
    	Persistence client=Client.getPersistence();
    	System.out.println(client.persist());
    }
}