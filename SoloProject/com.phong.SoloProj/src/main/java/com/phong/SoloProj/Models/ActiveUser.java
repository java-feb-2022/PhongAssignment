package com.phong.SoloProj.Models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class ActiveUser {



	//login portion of page 
	
		@NotEmpty(message="Email address is required.")
		@Email(message="Valid email format is required.")
		private String email;
		
		@NotEmpty(message="Password address is required.")
		@Size(min =8, max=64, message="Password must be between 8 and 64 characters")
		private String password;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
}
