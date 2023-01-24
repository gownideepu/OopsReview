package Com.BridgeLabs;

public class Patient {
	private String Name;
	private String Age;
	private String PhoneNumber;
	private String City;
	private String State;
	private String Department;
	
	void Contact(String Name,String Age,String PhoneNumber,String City,String State,String Department)
	{
		this.Name=Name;
		this.Age=Age;
		this.PhoneNumber=PhoneNumber;
		this.City=City;
		this.State=State;
		this.Department=Department;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
	
	
}
