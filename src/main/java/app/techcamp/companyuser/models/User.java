package app.techcamp.companyuser.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
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
	private String fullName;
	
	@NotBlank
	@Size(min = 3, max = 100)
	private String email;
	
	@NotBlank
	@Size(min = 3, max = 20)
	private String phoneNumber;
	
	@NotBlank
	@Size(min = 10, max = 150)
	private String password;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "course_id", nullable = false)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @JsonIgnore
    private Company company;
	
	public User() {
	}

	public User(Long id, @NotBlank @Size(min = 3, max = 150) String fullName,
			@NotBlank @Size(min = 3, max = 100) String email, @NotBlank @Size(min = 3, max = 20) String phoneNumber,
			@NotBlank @Size(min = 10, max = 150) String password, Company company) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.company = company;
	}



	public Company getCompany() {
		return company;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
