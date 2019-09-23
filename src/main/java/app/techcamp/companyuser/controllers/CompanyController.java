package app.techcamp.companyuser.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.techcamp.companyuser.models.Company;
import app.techcamp.companyuser.repositories.CompanyRepository;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyRepository companyrepo;
	
	@GetMapping("/companies")
	public Page<Company> getCompaniess(Pageable pageable) {
	        return companyrepo.findAll(pageable);           
	}
	
	@PostMapping("/companies")
	public Company createCompany(@Valid @RequestBody Company company) {
	     return companyrepo.save(company);
	}

}
