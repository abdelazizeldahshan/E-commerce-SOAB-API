package repo.daos.interfaces;

import java.util.List;

import repo.entities.CustomerEntity;

public interface CustomerDaoInt {

    List<CustomerEntity> getAllCustomers();

    CustomerEntity getCustomerById(int id);

    boolean addCustomer(CustomerEntity customerEntity);

    boolean updateCustomer(CustomerEntity customerEntity);

    boolean deleteCustomer(int id);
}
