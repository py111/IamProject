/**
 * 
 */
package in.py.iam.datamodel;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Identities")
public class Identity {

	@Id
	private String UserName;
	
	private String lastName;
	private String firstName;
	private String emailid;
	private String password;
	private String birthdate;
	
	
	
	public Identity(String UserName,String lastName, String firstName, String emailid, String password, String birthdate) {
		super();
		this.UserName = UserName;
		this.lastName = lastName;
		this.firstName = firstName;
		this.emailid = emailid;
		this.password = password;
		this.birthdate = birthdate;
	}
	
	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public Identity(){
		
	}
	@Override
	public String toString()
	{
		return "Identity [UserName=" + UserName + ", lastName=" + lastName + ", firstName=" 
	+ firstName + ", emailid=" + emailid + ", password=" + password + ", birthdate=" + birthdate + "]";
	}

}
