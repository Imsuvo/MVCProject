package com.about;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class about 
{
	@RequestMapping("/about")
	public String About()
	{
		return "about";
	}
}
