package project.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_id;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="PASSWORD")
	private String password;
	
	@JoinColumn(name="CARER1")
	private int carer1;
	
	@JoinColumn(name="CARER2")
	private int carer2;
	
	@JoinColumn(name="CARER3")
	private int carer3;
	
	@Column(name="TYPE")
	private int type;
	
	public User(){
		
	}

	public User(int user_id, String username, String password, int carer1, int type) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.carer1 = carer1;
		this.type = type;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCarer1() {
		return carer1;
	}

	public void setCarer1(int carer1) {
		this.carer1 = carer1;
	}

	public int getCarer2() {
		return carer2;
	}

	public void setCarer2(int carer2) {
		this.carer2 = carer2;
	}

	public int getCarer3() {
		return carer3;
	}

	public void setCarer3(int carer3) {
		this.carer3 = carer3;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
