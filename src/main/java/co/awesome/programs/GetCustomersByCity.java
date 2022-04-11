package co.awesome.programs;

import java.io.IOException;
import java.util.List;

import co.awesome.dao.CustomerDao;
import co.awesome.dao.DaoFactory;
import co.awesome.entity.Customer;

public class GetCustomersByCity {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();
		
		List<Customer> list = dao.getAllCustomers();
		System.out.println("There are "+list.size() + " customers.");
		for(Customer c: list) {
			System.out.println(c.getName()+ " is from " + c.getCity());
		}
	}

}
