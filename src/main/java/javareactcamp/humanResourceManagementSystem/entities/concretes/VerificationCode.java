package javareactcamp.humanResourceManagementSystem.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "verification_codes")
public class VerificationCode {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	public int id;
	
	@Column(name = "code", nullable = false)
	public String code;
	
	@Column(name = "is_verified", nullable = false)
	public boolean isVerified;
	
	@Column(name = "verified_date", nullable = false)
	public LocalDate verifiedDate=LocalDate.now();
	
}
