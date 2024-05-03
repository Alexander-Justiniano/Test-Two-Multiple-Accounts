package com.codingdojo.display_date.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("")
	public String index(Model model) {
		return "index.jsp";
	}
	
	@RequestMapping("time")
	public String time(Model model) {
		
		SimpleDateFormat simpDate = new SimpleDateFormat("h:mm a");
		
		Date time = new Date();
		
		model.addAttribute("time", simpDate.format(time));
		
		return "time.jsp";
	}
	
	@RequestMapping("date")
	public String date(Model model) {
		
		SimpleDateFormat simpDate = new SimpleDateFormat("EEEE, MMM d, yyy");
		
		Date date = new Date();
		
		model.addAttribute("date", simpDate.format(date));
		
		return "date.jsp";
	}

}
