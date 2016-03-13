package AutoComponentScanning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoComponentScaningTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "AutoScanningComponentXml.xml" });
		// CustomerService cust = (CustomerService)
		// context.getBean("customerService");
		CustomerService cust = (CustomerService) context.getBean("CustomAutoScanComponentName");
		System.out.println(cust);

	}

}
