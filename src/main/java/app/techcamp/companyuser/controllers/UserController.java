package app.techcamp.companyuser.controllers;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.techcamp.companyuser.exceptions.ResourceNotFoundException;
import app.techcamp.companyuser.models.User;
import app.techcamp.companyuser.repositories.CompanyRepository;
import app.techcamp.companyuser.repositories.UserRepository;


@RestController
public class UserController {
	
	@Autowired
	private UserRepository userrepo;
	
	@Autowired
	private CompanyRepository comprepo;
	
	@GetMapping("/companies/{coid}/users")
	public Page<User> getCompaniess(@PathVariable Long coid, Pageable pageable) 
	{
		if(!comprepo.existsById(coid)) 
		{
			 throw new ResourceNotFoundException("company not found with id " + coid);
		}
		return userrepo.findAll(pageable);
	}
	
	@PostMapping("/companies/{coid}/users")
	public User createCompany(@PathVariable Long coid, @Valid @RequestBody User user) 
	{
		return comprepo.findById(coid)
                .map(company -> {
                	user.setCompany(company);
                    return userrepo.save(user);
        }).orElseThrow(() -> new ResourceNotFoundException("company not found with id " + coid));
	
	}
	
}
