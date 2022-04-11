package co.awesome.programs;

import java.io.IOException;

import co.awesome.dao.CustomerDao;
import co.awesome.dao.DaoFactory;
import co.awesome.entity.Customer;

public class DeleteCustomer {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();
		int id = 9;
		Customer c1 = dao.getCustomerById(id);
		
		if (c1==null) {
			System.out.println("No data found for id "+id);
		}
		else {
			dao.deleteCustomer(10);
			System.out.println("Customer with id "+id+" is deleted");
		}
		
		
	}

}
