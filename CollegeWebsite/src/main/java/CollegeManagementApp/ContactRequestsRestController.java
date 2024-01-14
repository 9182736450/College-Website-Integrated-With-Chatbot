package CollegeManagementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactRequestsRestController {

	@Autowired
	private ContactRequestsRepository repo;

	@GetMapping("/sbwebpage")
	public String ShowUniversityWebPage() {
		return "sharnbasva.jsp";
	}

	@PostMapping("/thankyou")
	public String addcontactrequest(@ModelAttribute ContactRequests user) {

		repo.save(user);
		return "thankyou.jsp";
	}
}