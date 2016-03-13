package SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeXml.xml");
	    Employee objOne = (Employee) context.getBean("employeeClassBean");
	    System.out.println(objOne.getName() + '\n' + objOne.getAddress().getAddress1());
	    
	    
	    
	    Employee objTwo = (Employee) context.getBean("employeeClassBean");
	    
	    System.out.println(objOne.hashCode());
	    System.out.println(objTwo.hashCode());
	    System.out.println("The same hash Code shows single instance of EMPloyee class is created ");
	    

	}

}
