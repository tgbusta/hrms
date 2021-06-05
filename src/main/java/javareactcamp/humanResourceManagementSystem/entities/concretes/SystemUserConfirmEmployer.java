package javareactcamp.humanResourceManagementSystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javareactcamp.humanResourceManagementSystem.entities.abstracts.SystemUserConfirm;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "system_user_confirm_employers")
public class SystemUserConfirmEmployer extends SystemUserConfirm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	public int id;

	@Column(name = "employer_id", nullable = false)
	public int employerId;
	
}
