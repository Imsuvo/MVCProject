package com.prathyusha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class prathyusha 
{
	@RequestMapping("/prathyusha")
	public String Prathyusha()
	{
		return "prathyusha";
	}
}
