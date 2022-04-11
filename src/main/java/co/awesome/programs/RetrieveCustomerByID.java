package co.awesome.programs;

import java.io.IOException;

import co.awesome.dao.CustomerDao;
import co.awesome.dao.DaoFactory;
import co.awesome.entity.Customer;

public class RetrieveCustomerByID {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();

		int id = 22;
		Customer c1 = dao.getCustomerById(id);
		if (c1==null) {
			System.out.println("No customer data for id: "+ id);
		} 
		else {
			System.out.println(c1);
		}
	}

}
