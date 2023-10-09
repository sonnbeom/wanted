package wanted.preonboardingbackend.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wanted.preonboardingbackend.entity.Company;

import java.util.Optional;
@Repository

public interface MemoryCompanyRepository extends JpaRepository<Company, String> {
    Optional<Company> findById(String id);
}
