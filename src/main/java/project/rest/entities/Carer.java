package project.rest.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="Carer")
public class Carer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int carer_id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="MOBILE")
	private String mobile;

	public Carer(int carer_id, String name, String mobile) {
		super();
		this.carer_id = carer_id;
		this.name = name;
		this.mobile = mobile;
	}

	public int getCarer_id() {
		return carer_id;
	}

	public void setCarer_id(int carer_id) {
		this.carer_id = carer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	

}
