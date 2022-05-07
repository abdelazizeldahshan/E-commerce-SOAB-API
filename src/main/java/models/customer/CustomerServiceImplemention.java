package models.customer;

import java.util.List;

import jakarta.jws.WebService;
import service.implementations.CustomerServiceImpl;
import service.interfaces.CustomerServiceInt;

@WebService(endpointInterface = "models.customer.CustomerServiceInterface")
public class CustomerServiceImplemention implements CustomerServiceInterface {

    CustomerServiceInt customerService = new CustomerServiceImpl();

    @Override
    public List<Customer> getCustomers() {
        return customerService.getAllCustomer();
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerService.getCustomerById(id);
    }

    @Override
    public boolean signupCustomer(CustomerPost customerPost) {
        return customerService.addCustomer(customerPost);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return customerService.deleteCustomer(id);
    }

}
