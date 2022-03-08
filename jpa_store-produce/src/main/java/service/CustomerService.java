package service;

import model.Customer;
import repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        return customerRepository.insertWithStoredProcedure(customer);
    }
}
