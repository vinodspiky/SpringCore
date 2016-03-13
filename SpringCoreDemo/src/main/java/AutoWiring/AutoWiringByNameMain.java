package AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringByNameMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autoWireByNameXml.xml");		
	    Employee objOne = (Employee) context.getBean("employeeClassBean");
	    System.out.println(objOne.getName() + '\n' + objOne.getAddress().getAddress1());   
	    
	}

}
