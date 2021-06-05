package javareactcamp.humanResourceManagementSystem.entities.abstracts;

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
@Table(name = "system_user_confirms")
public abstract class SystemUserConfirm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	public int id;

	@Column(name = "system_user_id", nullable = false)
	public int systemUserId;

	@Column(name = "is_confirmed", nullable = false)
	public boolean isConfirmed;
	
	@Column(name="confirm_date", nullable=false)
	public LocalDate confirmDate=LocalDate.now();
}
