package app.techcamp.companyuser.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "companies")
public class Company extends AuditModel {
	
	@Id
    @GeneratedValue(generator = "company_generator")
    @SequenceGenerator(
            name = "company_generator",
            sequenceName = "company_sequence",
            initialValue = 1000
    )
    private Long id;
	
	 @NotBlank
	 @Size(min = 3, max = 100)
	 private String company_name;
	 
	 @NotBlank
	 @Size(min = 3, max = 100)
	 private String company_email;
	 
	 @Column(columnDefinition = "text")
	 private String company_pin;
	 
	 @Column(columnDefinition = "text")
	 private String company_registration;
	 
	 @Column(columnDefinition = "text")
	 private String company_category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_email() {
		return company_email;
	}

	public void setCompany_email(String company_email) {
		this.company_email = company_email;
	}

	public String getCompany_pin() {
		return company_pin;
	}

	public void setCompany_pin(String company_pin) {
		this.company_pin = company_pin;
	}

	public String getCompany_registration() {
		return company_registration;
	}

	public void setCompany_registration(String company_registration) {
		this.company_registration = company_registration;
	}

	public String getCompany_category() {
		return company_category;
	}

	public void setCompany_category(String company_category) {
		this.company_category = company_category;
	}

	public Company() {
		
	}

	public Company(Long id, @NotBlank @Size(min = 3, max = 100) String company_name,
			@NotBlank @Size(min = 3, max = 100) String company_email, String company_pin, String company_registration,
			String company_category) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.company_email = company_email;
		this.company_pin = company_pin;
		this.company_registration = company_registration;
		this.company_category = company_category;
	}
	
}
