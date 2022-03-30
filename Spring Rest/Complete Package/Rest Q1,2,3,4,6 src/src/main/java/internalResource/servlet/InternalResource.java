package internalResource.servlet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SuppressWarnings("deprecation")
@Configuration
@ComponentScan({ "rest.ques1", "rest.ques2", "rest.ques3", "rest.ques4", "rest.ques6" })
@EnableWebMvc
public class InternalResource extends WebMvcConfigurerAdapter {
	@Bean
	public InternalResourceViewResolver name() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
