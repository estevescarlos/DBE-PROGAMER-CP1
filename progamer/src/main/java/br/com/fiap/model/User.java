package br.com.fiap.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_USER")
public class User {

	@Id
	@Column(name = "cd_user")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code;

	@Column(name = "nm_name", nullable = false, length = 75)
	private String name;

	@Column(name = "ds_email", nullable = false, length = 75)
	private String email;

	@Column(name = "ds_password", nullable = false, length = 16)
	private String password;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_born", nullable = false)
	private Date dateBorn;

	public User() {
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateBorn() {
		return dateBorn;
	}

	public void setDateBorn(Date dateBorn) {
		this.dateBorn = dateBorn;
	}

	@Override
	public String toString() {
		return "code=" + code + ", name=" + name + ", email=" + email + ", dateBorn="
				+ dateBorn + "]";
	}

}