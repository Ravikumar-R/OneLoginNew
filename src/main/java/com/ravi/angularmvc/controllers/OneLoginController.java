/**
 * 
 */
package com.ravi.angularmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ravi.angularmvc.domain.Applications;
import com.ravi.angularmvc.domain.LoginBean;

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
	public @ResponseBody Applications loginPage(@RequestBody LoginBean credentials) {
		System.out.println("login Page");
		Applications application = new Applications();
		String[] applicationList = { "Application 1", "Application 2",
				"Application 3", "Application 5", "Application 6" };
		application.setApplication(applicationList);
	return application;
	}

	@RequestMapping(value = "/applicationdetails", method = RequestMethod.POST)
	public @ResponseBody Applications applicationDetails(@RequestBody Applications application) {
		System.out.println("application details");
		return application;
	}
	
}
