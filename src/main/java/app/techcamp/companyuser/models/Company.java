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
	 private String companyName;
	 
	 @NotBlank
	 @Size(min = 3, max = 100)
	 private String companyEmail;
	 
	 @Column(columnDefinition = "text")
	 private String companyPin;
	 
	 @Column(columnDefinition = "text")
	 private String companyRegistration;
	 
	 @Column(columnDefinition = "text")
	 private String companyCategory;
	 
	public Company() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyPin() {
		return companyPin;
	}

	public void setCompanyPin(String companyPin) {
		this.companyPin = companyPin;
	}

	public String getCompanyRegistration() {
		return companyRegistration;
	}

	public void setCompanyRegistration(String companyRegistration) {
		this.companyRegistration = companyRegistration;
	}

	public String getCompanyCategory() {
		return companyCategory;
	}

	public void setCompanyCategory(String companyCategory) {
		this.companyCategory = companyCategory;
	}
	
}
