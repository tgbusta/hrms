package javareactcamp.humanResourceManagementSystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Entity
@Table(name="system_users")

public class SystemUser extends User{

	@Column(name="first_name", nullable=false)
	private String firtName;
	
	@Column(name="last_name", nullable=false)
	private String lastName;
	
}
