package testpackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Utilisation du fichier xml et definition des beans
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
		test b1 = context.getBean("test",test.class);
		
		
		
		
	}

}
