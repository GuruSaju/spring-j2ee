package guru.spring.pagination.model;

/**
 * 
 * @author Srisarguru
 *
 */
public class Contact {
	 private String id;
	 private String name;
	 private String phoneNo;
	 
	public Contact(String id, String name, String phoneno) {
		this.id=id;
		this.name=name;
		this.phoneNo=phoneno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
