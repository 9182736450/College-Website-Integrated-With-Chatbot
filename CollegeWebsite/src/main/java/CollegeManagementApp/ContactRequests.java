package CollegeManagementApp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact_requests_tb")
public class ContactRequests {

	@Column(nullable = false)
	private String fullname;

	@Id
	private Long phone;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String concern;

	public ContactRequests() {

	}

	public ContactRequests(String fullname, Long phone, String email, String concern) {
		this.fullname = fullname;
		this.phone = phone;
		this.email = email;
		this.concern = concern;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConcern() {
		return concern;
	}

	public void setConcern(String concern) {
		this.concern = concern;
	}

	@Override
	public String toString() {
		return "ContactRequests [fullname=" + fullname + ", phone=" + phone + ", email=" + email + ", concern="
				+ concern + "]";
	}

}
