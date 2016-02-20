/**
 * 
 */
package com.tcs.klm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping("/login")
	public String loginPage() {
		System.out.println("login Page");
		return "includes\\login";
	}
}
