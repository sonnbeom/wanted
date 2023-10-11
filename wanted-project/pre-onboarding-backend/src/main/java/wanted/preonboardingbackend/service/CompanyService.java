package wanted.preonboardingbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wanted.preonboardingbackend.entity.Company;
import wanted.preonboardingbackend.exception.NotFoundException;
import wanted.preonboardingbackend.repository.MemoryCompanyRepository;

@Service
public class CompanyService {
    @Autowired
    MemoryCompanyRepository memoryCompanyRepository;
    public Company findById(String id){
        return memoryCompanyRepository.findById(id).orElseThrow(()->new NotFoundException("Company is not found by : "+id));
    }
}
