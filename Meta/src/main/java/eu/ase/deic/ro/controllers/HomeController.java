package eu.ase.deic.ro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String hello() {
		System.out.println("Hello");
		return "index.html";
	}
	
}
