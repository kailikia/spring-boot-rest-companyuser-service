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
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "course_id", nullable = false)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @JsonIgnore
    private Company company;
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, @NotBlank @Size(min = 3, max = 150) String full_name,
			@NotBlank @Size(min = 3, max = 100) String email, @NotBlank @Size(min = 3, max = 20) String phone_number,
			@NotBlank @Size(min = 10, max = 150) String password) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.email = email;
		this.phone_number = phone_number;
		this.password = password;
	}
	
	

}
