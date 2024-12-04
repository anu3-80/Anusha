package Spring_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config 
{
	@Bean
	public Student stu()
	{
		Student s=new Student();
		s.setName("Anusha");
		s.setSectioon("A");
		s.setMarks(45);
		s.setClg("Sviet");
		return s;
	}
	@Bean
	public Employee emp()
	{
		Employee e=new Employee(1,"Kishore","Technical Dept",25000);
		return e;
	}
}
