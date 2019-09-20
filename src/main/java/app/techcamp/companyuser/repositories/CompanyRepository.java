package app.techcamp.companyuser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.techcamp.companyuser.models.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{

}
