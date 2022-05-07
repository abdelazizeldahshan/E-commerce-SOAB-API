package service.interfaces;

import models.customer.Customer;
import models.customer.CustomerPost;
import java.util.List;

public interface CustomerServiceInt {

    List<Customer> getAllCustomer();

    Customer getCustomerById(int id);

    boolean addCustomer(CustomerPost customerPost);

    boolean updateCustomer(Customer customer);

    boolean deleteCustomer(int id);
}
