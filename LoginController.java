package com.example.demo.the.cafe;
import com.example.demo.the.cafe.model.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class LoginController {
	
	@Autowired
	SessionFactory sf;
	
	@RequestMapping("/")
	public String root()
	{
		return "home";
	}
	
	@RequestMapping("loginpage")
	public String loginpage()
	{
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(Login login)
	{
		Session ss= sf.openSession();
		Login dblogin = ss.get(Login.class, login.getPass());
		
		if(dblogin !=null && login.getEmail().equals(dblogin.getEmail()) && login.getPass().equals(dblogin.getPass()))
		{
		return "home";
		}
		else {
			return "login";
		}
	}
	
	@RequestMapping("/signuppage")
	String signuppage()
	{
		return "signup";
	}
	
	@RequestMapping("/signup")
	public String signup(Login login) {
		Session ss = sf.openSession();
		Transaction tx =ss.beginTransaction();
		ss.save(login);
		tx.commit();
		return "login";
	}	
	
	@RequestMapping("/homepage")
	public String homepage()
	{
		return "home";
	}

	@RequestMapping("/aboutpage")
	public String aboutpage()
	{
		return "about";
	}
	
	@RequestMapping("/menupage")
	public String menupage()
	{
		return "menu";
	}
	
	@RequestMapping("/locationpage")
	public String locationpage()
	{
		return "location";
	}
	
	@RequestMapping("/location")
	public String contact(Contact contact) {
		Session ss = sf.openSession();
		Transaction tx =ss.beginTransaction();
		ss.save(contact);
		tx.commit();
		return "location";
	}
	
	@RequestMapping("/resetpage")
	public String resetpage()
	{
		return "reset";
	}

}
