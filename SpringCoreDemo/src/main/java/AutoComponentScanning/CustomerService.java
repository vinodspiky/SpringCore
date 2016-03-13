package AutoComponentScanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("CustomAutoScanComponentName")
//@Component
public class CustomerService {
	@Autowired
	CustomerDAO customerDAO;

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}

}
