package project.packet.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.packet.model.Customer;
import project.packet.model.Province;

@Repository
public interface IProvinceRepository extends PagingAndSortingRepository<Province, Long> {

}
