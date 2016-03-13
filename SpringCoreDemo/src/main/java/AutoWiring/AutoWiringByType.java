package AutoWiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Not Able To undestand propely
public class AutoWiringByType {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autoWireByTypeXml.xml");		
	    Employee objOne = (Employee) context.getBean("employeeClassBean");
	    System.out.println(objOne.getName() + '\n' + objOne.getAddress().getAddress1());   
	    
	}

}
