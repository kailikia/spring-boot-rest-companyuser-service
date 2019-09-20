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


}
