package project.packet.service.province;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.packet.model.Province;
import project.packet.repository.IProvinceRepository;
import project.packet.service.province.IProvinceService;

import java.util.Optional;
@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }
}
