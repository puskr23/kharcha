package com.puskar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Component
@RestController
public class LoginResources {
	@Autowired
	private LoginRepository loginRepo;
	@GetMapping("a/login")
	public List<Mobileclubillingplans> getLogin()
	{
	
		return (List<Mobileclubillingplans>) loginRepo.findAll();
	}
	@GetMapping("a/list")
	public List<String> getusers()
	{
		return loginRepo.getUsers();
		
	}
//	@PostMapping
//	public void saveUser( @RequestBody User loginDetail)
//	{
		
	public static void main(String[] args) {
		
			LoginResources l=new LoginResources();
			//List<Mobileclubillingplans> abc=l.getLogin();
			for (String user:l.getusers())
			{
				System.out.println(user);
			}
		
	}

}
