package ques2.spring.assiggnmnet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class QuestionTest {

	ApplicationContext context;
	Question question;
	@BeforeEach
	void berfoeEach() {
		context = new ClassPathXmlApplicationContext("Ques2.xml");
		question=(Question) context.getBean("question");
	}

	@Test
	@DisplayName("First Test case")
	void test() {
		//when Answers are in List
		String expected="QuestionNumber : 1\nQuestion : Mention any Wild Animal?\nAnswers : [Lion, Tiger, Bull, Hippo, Bear]";
		
		//when Answers are in Set
		//String expected="QuestionNumber : 1\nQuestion : Mention any Wild Animal?\nAnswers : [Lion, Tiger, Bull, Hippo, Bear]";
				
		//when Answers are in Map
		//String expected="QuestionNumber : 1\nQuestion : Mention any Wild Animal?\nAnswers : {1=Lion, 2=Tiger, 3=Bull, 4=Hippo, 5=Bear}";
		
		assertEquals(expected, question.Display());
	}

}
