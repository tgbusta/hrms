package javareactcamp.humanResourceManagementSystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@Table(name="employers")

public class Employer extends User{

	@Column(name="company_name", nullable=false)
	private String companyName;
	
	@Column(name="web_adress", nullable=false)
	private String webAdress;
	
	@Column(name="phone_number",nullable = false)
	private String phoneNumber;
		
	@Column (name="is_active" , nullable=false)
	private boolean isActive=false;
	
	@Transient
	private String rePassword;
	
}
