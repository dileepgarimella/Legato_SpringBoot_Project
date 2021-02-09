package com.legato.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.legato.modal.Details;
import com.legato.modal.Credentials;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ProjectController {
	
	@GetMapping("/details")
	 public List<Details> getDetails() 
   {
     List<Details> detailsList = new ArrayList<Details>();
     detailsList.add(new Details("lokesh","vijayawada"));
     return detailsList;
   }
	@PostMapping("/postDetails")
	public List<Details> postDetails( @RequestBody Details details)
	{
		System.out.println(details);
		 List<Details> detailsList = new ArrayList<Details>();
	     detailsList.add(new Details(details.getName(),details.getCity()));
	     return detailsList;
	}
	
	@GetMapping("/credentials")
	public List<Credentials> getCredentials()
	{
		List<Credentials> credentialsList =new ArrayList<Credentials>();
		credentialsList.add(new Credentials("pandu","pandu"));
		return credentialsList;
	}
}	

