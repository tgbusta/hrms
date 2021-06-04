package javareactcamp.humanResourceManagementSystem.entities.concretes;

import java.util.Date;

import javax.persistence.*;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@Table(name="candidates")

public class Candidate extends User {

	@Column(name="first_name", nullable=false)
	private String firstName;
	
	@Column(name="last_name", nullable=false)
	private String lastName;
	
	@Column(name="identity_number",nullable = false, unique = true)
	private long identityNumber;
	
	@Column(name="birth_year", nullable=false)
	private Date birthYear;
	
	@Column(name = "email", nullable = false)
	public String email;
	
	@Column(name = "password", nullable = false)
	public String password;
	
	@Column (name="is_active" , nullable=false)
	private boolean isActive=false;
	
	@Transient
	private String rePassword;
}
