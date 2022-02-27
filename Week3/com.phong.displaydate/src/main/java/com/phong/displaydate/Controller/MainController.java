package com.phong.displaydate.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;  
import java.time.format.DateTimeFormatter;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
		
	}
	
	//2 new method to handle date /time 
	//get date and time 
	
	@RequestMapping("/date")
		public String date(Model modelDate) {
		Date currentDate=new Date ();   
		
		SimpleDateFormat formatted= new SimpleDateFormat("EEEEE, 'the' dd 'of' MMM, yyyy", Locale.ENGLISH);  
		modelDate.addAttribute("currentDate",formatted.format(currentDate)); 


		return "date.jsp"; 
			
		}
	
	@RequestMapping("/time")
		public String time(Model modelTime ) {
		Date currentTime= new Date (); 	
		SimpleDateFormat formattedTime= new SimpleDateFormat("h:mm aa ");
		modelTime.addAttribute("currentTime", formattedTime.format(currentTime)); 
		 
	
	
	return "time.jsp"; 
		
	}
	
	

}
