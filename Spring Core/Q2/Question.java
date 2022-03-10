/*
 * Example of Injecting collections (List, Set and Map)
Create a class Question with following attributes: questionId, question, answers.
There are 3 cases for above program.
a. Write a program where answers is of type List<String> or String []
b. Write a program where answers is of type Set<String>
c. Write a program where answers is of type Map<Integer, String>
In case of Map, Integer value represents answer’s sequence number.
d. Create a Test class with main() method, get Question bean from
ApplicationContext object and print question and its answers.
e. Also write the JUnit Test cases for above program.
- Use XML based configuration.
 */

package ques2.spring.assiggnmnet;

import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("unused")
public class Question {
	int questionId; 
	String question;
	
	
	List<String> answers;
	public Question(int questionId, String question, List<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	
	
	/**
	Set<String> answers; 
	public Question(int questionId, String question,Set<String> answers) { 
		super(); 
		this.questionId = questionId; 
		this.question =question; 
		this.answers = answers; 
	}
	**/
	 
	/**
	Map<Integer, String> answers;
	public Question(int questionId, String question, Map<Integer, String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	**/
	
	public String Display() {
		return "QuestionNumber : "+questionId+"\nQuestion : "+question+"\nAnswers : "+answers;
	}
	

}
