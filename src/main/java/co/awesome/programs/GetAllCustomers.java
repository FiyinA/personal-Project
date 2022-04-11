package co.awesome.programs;

import java.io.IOException;
import java.util.List;

import co.awesome.dao.CustomerDao;
import co.awesome.dao.DaoFactory;
import co.awesome.entity.Customer;

public class GetAllCustomers {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();
		
		String city = "Texas";
		List<Customer> list = dao.getCustomersByCity(city);
		System.out.println("There are "+list.size() + " customers from "+ city);
		for(Customer c: list) {
			System.out.println(c);
		}
	}

}
