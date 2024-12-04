package Spring_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		
		ApplicationContext c=new AnnotationConfigApplicationContext(Config.class);
		Student s=c.getBean(Student.class);
		System.out.println(s);
		Employee e=c.getBean(Employee.class);
		System.out.println(e);
		Game g=c.getBean(Game.class);
		System.out.println(g);
	}

}
