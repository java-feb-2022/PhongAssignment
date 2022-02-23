package com.daikichi.route;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
 
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
        return "You searched for: " + searchQuery;
    }
	
	
		@RequestMapping("")
		public String welcome() {
			return "Welcome!"; 
		}
		
		@RequestMapping("/today")
		public String today() {
			return "Today you will find luck in all your endeavors";    
		}
		
		@RequestMapping("/tomorrow")
		public String tomorrow() {
			return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";  
		}
		
		@RequestMapping("/travel/Honolulu")
		public String honolulu() {
			return "Congratulations! You will soon travel to Honolulu"; 
		}
		
		@RequestMapping("/lotto/6")
		public String lotto6() {
			return "You will take a grand journey in the near future, but be wary of tempting offers"; 
		}
		@RequestMapping("/lotto/37")
		public String lotto27() {
			return "You have enjoyed the fruits of your labor but now is a great time to spend with family and friends.";   
		}
		@RequestMapping("/travel/{city}")
		public String city(@PathVariable String city) {
			return "Congradulations! You will soon travel to "+city;    
		}

		@RequestMapping("/lotto/{value}")
		public String takeInValue(@PathVariable int value) {
 
			if (value %2 ==0 ) {
				return "You will take a grand journey in the near future, but be weary of tempting offers"; 
			}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";    
		}

	}
}
	


