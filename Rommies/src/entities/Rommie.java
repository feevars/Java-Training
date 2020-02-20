package entities;

import java.io.Serializable;
import java.util.Date;

public class Rommie implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String telephone;
	private String email;
	private Date birthDate;
	
	//private Room room;
	//private Address address;
	
	
	public Rommie () {
		
	}
	
	public Rommie(Integer id, String name, String telephone, String email, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
		this.birthDate = birthDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rommie other = (Rommie) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
