package project.packet.service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import project.packet.model.Customer;
import project.packet.model.Province;
import project.packet.repository.ICustomerRepository;
import project.packet.service.IGeneralService;

import java.util.Optional;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);

}
