package javareactcamp.humanResourceManagementSystem.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public abstract class User{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	public int id;
	
	@Column(name = "email", nullable = false)
	public String email;
	
	@Column(name = "password", nullable = false)
	public String password;

}
