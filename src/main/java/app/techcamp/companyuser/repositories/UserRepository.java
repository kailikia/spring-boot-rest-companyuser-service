package app.techcamp.companyuser.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.techcamp.companyuser.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	List<User> findByCompanyId(Long companyid);
}
