/**
 * 
 */
package com.tcs.klm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@RequestMapping(value = "/login", method = RequestMethod.POST,consumes = {"application/json;charset=UTF-8"}, produces={"application/json;charset=UTF-8"})
	public @ResponseBody String loginPage(@RequestBody LoginBean credentials) {
		System.out.println("login Page");
		return "includes\\login";
	}
}
