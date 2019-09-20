package app.techcamp.companyuser.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User extends AuditModel{
	
	@Id
    @GeneratedValue(generator = "user_generator")
    @SequenceGenerator(
            name = "user_generator",
            sequenceName = "user_sequence",
            initialValue = 1000
    )
    private Long id;
	
	@NotBlank
	@Size(min = 3, max = 150)
	private String full_name;
	
	@NotBlank
	@Size(min = 3, max = 100)
	private String email;
	
	@NotBlank
	@Size(min = 3, max = 20)
	private String phone_number;
	
	@NotBlank
	@Size(min = 10, max = 150)
	private String password;

}
