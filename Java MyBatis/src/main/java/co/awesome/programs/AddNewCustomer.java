package co.awesome.programs;

import java.io.IOException;

import co.awesome.dao.CustomerDao;
import co.awesome.dao.DaoFactory;
import co.awesome.entity.Customer;

public class AddNewCustomer {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();
		
		Customer c1 = new Customer();
		c1.setName("John");
		c1.setCity("Des Moines");
		c1.setEmail("james@gmail.com");
		c1.setPhone("15165161654");
		
		dao.addCustomer(c1);
		System.out.println(c1);
	}

}
