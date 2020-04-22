package com.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController 
{
@RequestMapping("home")
public String display(HttpServletRequest req)
{
String Uname=req.getParameter("name");
System.out.println("soumya");
System.out.println("welcome");
return "home";
}

}


