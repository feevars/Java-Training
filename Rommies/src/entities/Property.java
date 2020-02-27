package entities;

import java.util.ArrayList;
import java.util.List;

public class Property {
	
	private Integer id;
	private String name;
	private String email;
	
	private Adress adress;
	private PropertyOwner propertyOwner;
	private ArrayList<Rommie> rommie;
	private ArrayList<Room> rooms;
	
	public Property() {
		
	}
	
	public Property(Integer id, String name, String email, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.adress = adress;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public PropertyOwner getPropertyOwner() {
		return propertyOwner;
	}

	public void setPropertyOwner(PropertyOwner propertyOwner) {
		this.propertyOwner = propertyOwner;
	}

	public ArrayList<Rommie> getRommie() {
		return rommie;
	}

	public void setRommie(ArrayList<Rommie> rommie) {
		this.rommie = rommie;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
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
		Property other = (Property) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
