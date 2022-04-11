package co.awesome.programs;

import java.io.IOException;

import co.awesome.dao.CustomerDao;
import co.awesome.dao.DaoFactory;
import co.awesome.entity.Customer;

public class UpdateCustomerData {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();

		int id = 3;
		Customer c1 = dao.getCustomerById(id);
		if (c1==null) {
			System.out.println("No customer data for id: "+ id);
		} 
		else {
			System.out.println("Before update....:"+ c1);
			c1.setCity("Dallas");
			c1.setPhone("21651551");
			dao.updateCustomer(c1);
			
			c1 = dao.getCustomerById(3);
			System.out.println("After updating...:" + c1);
		}
	}

}
