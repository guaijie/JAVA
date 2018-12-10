package indi.jie.bean;

public class UserInfo {
	
	private long id;
	private String username;
	private String name;
	private String birthDay;
	private String phone;
	private String address;
	private String sessionToken;

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	public UserInfo(){
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserInfo{" +
		"id=" + id +
		", username='" + username + '\'' +
		", name='" + name + '\'' +
		", birthDay='" + birthDay + '\'' +
		", phone='" + phone + '\'' +
		", address='" + address + '\'' +
		", sessionToken='" + sessionToken + '\'' +
		'}';
	}
}
