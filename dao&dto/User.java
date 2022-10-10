package oops;

public class User {
	private String name;
	private String email;
	private String password;
	private String cnfpassword;
	private long mobNo;
	
	
	User(String name, String email, String password, String cnfpassword, long mobNo ){
	this.name=name;
	this.email=email;
	this.password=password;
	this.cnfpassword=cnfpassword;
	this.mobNo=mobNo;
}
public User(String string) {
	
	}
public String getname() {
	return name;
}
	public void setname(String name) {
		this.name=name;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password=password;
	}
	public String getcnfpassword() {
		return cnfpassword;
	}
	public void setcnfpassword(String cnfpassword) {
		this.cnfpassword=cnfpassword;
	}
	public long getmobNo() {
		return mobNo;
	}
	public void setmobNo(long mobNo) {
		this.mobNo=mobNo;
	}
	}
	
	
