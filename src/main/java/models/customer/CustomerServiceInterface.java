package models.customer;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface CustomerServiceInterface {

    @WebMethod
    List<Customer> getCustomers();

    @WebMethod
    Customer getCustomerById(int id);

    @WebMethod
    boolean signupCustomer(CustomerPost customerPost);

    @WebMethod
    boolean updateCustomer(Customer customer);

    @WebMethod
    boolean deleteCustomer(int id);
}
