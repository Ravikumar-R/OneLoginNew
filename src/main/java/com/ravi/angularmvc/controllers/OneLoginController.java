/**
 * 
 */
package com.ravi.angularmvc.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ravi.angularmvc.domain.Applications;
import com.ravi.angularmvc.domain.Environments;
import com.ravi.angularmvc.domain.LoginBean;
import com.ravi.angularmvc.domain.LoginInformation;

/**
 * @author Ravi
 *
 */

@Controller
public class OneLoginController {

	@RequestMapping("/")
	public String welcomePage() {
		System.out.println("Welcome Page");
		return "onelogin";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody ArrayList<Applications> loginPage(
			@RequestBody LoginBean credentials) {
		System.out.println("login Page");
		Applications application;
		ArrayList<Applications> applicationList = new ArrayList<Applications>();
		for (int i = 0; i < 10; i++) {
			application = new Applications();
			application.setApplication("Application" + i);
			applicationList.add(application);
		}
		return applicationList;
	}

	@RequestMapping(value = "/applicationdetails", method = RequestMethod.POST)
	public @ResponseBody Applications applicationDetails(
			@RequestBody Applications selectedApplication) {
		System.out.println("application details");
		
		LoginInformation loginInformation = new LoginInformation();
		loginInformation.setRole("Application User");
		loginInformation.setUserName("User");
		loginInformation.setPassword("success");
		
		ArrayList<LoginInformation> loginInformationList = new ArrayList<LoginInformation>();
		loginInformationList.add(loginInformation);
		loginInformationList.add(loginInformation);
		
		
		Environments environments = new Environments();
		environments.setEName("ITE1");
		environments.setURL("www.ite1.com");
		environments.setLoginInformationList(loginInformationList);
		
		ArrayList<Environments> environmentsList = new ArrayList<Environments>();
		environmentsList.add(environments);
		environmentsList.add(environments);
		
		Applications applications = new Applications();
		applications.setApplication("Webapplication");
		applications.setEnvironmentList(environmentsList);
		
	/*	ArrayList<Applications> applicationsList = new ArrayList<Applications>();
		applicationsList.add(applications);
		applicationsList.add(applications);
		
		SpecifiedDomain specifiedDomain = new SpecifiedDomain();
		specifiedDomain.setSDName("Cargo");
		specifiedDomain.setApplicationsList(applicationsList);
		
		ArrayList<SpecifiedDomain> specifiedDomainList = new ArrayList<SpecifiedDomain>();
		specifiedDomainList.add(specifiedDomain);
		specifiedDomainList.add(specifiedDomain);
	
		Domain domain = new Domain();
		domain.setDomain("TTH");
		domain.setSpecifiedDomainList(specifiedDomainList);
*/		
		return applications;
	}

}



