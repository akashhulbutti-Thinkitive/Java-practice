package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EmployeeSerialized implements Serializable {

	private int eId;
	private String eName;
	private Address address;

	EmployeeSerialized() {
		System.out.println("Ha ha");
	}

	public EmployeeSerialized(int eId, String eName,Address address) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.address=address;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "EmployeeSerialized [eId=" + eId + ", eName=" + eName + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eId;
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
		EmployeeSerialized other = (EmployeeSerialized) obj;
		if (eId != other.eId)
			return false;
		return true;
	}

	public void serializeEmployee() {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("com.serialize.employee");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(this);

			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public EmployeeSerialized deserializeEmployee() {
		EmployeeSerialized empSer = null;
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream("com.serialize.employee");
			ois = new ObjectInputStream(fis);

			empSer = (EmployeeSerialized) ois.readObject();

			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return empSer;
	}

}
