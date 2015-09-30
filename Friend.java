
public class Friend implements InterfaceFriend {
	private String phone;//strings
	private String email;
	private String name;
	//default costructor
	public Friend(){
		this("","","");
	}
	//contructs new friend string
	public Friend(String Phone, String Email, String Name){
		this.email=Email;
		this.phone=Phone;
		this.name=Name;
	}
	//returns phone
	public String getPhone() {
		return phone;
	}
	public String getEmail() {//returns email
		return email;
	}

	public String getName() {//returns Name
		return name;
	}

	public void setPhone(String phone1) {//sets phone
		this.phone=phone1;
		
	}

	public void setEmail(String mail) {//sets mail
		this.email=mail;
	}

	public void setName(String name1) {//sets name
		this.name=name1;
		
	}


}
