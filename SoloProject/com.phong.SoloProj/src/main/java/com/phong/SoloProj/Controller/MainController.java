package com.phong.SoloProj.Controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.phong.SoloProj.Models.ActiveUser;
import com.phong.SoloProj.Models.Book;
import com.phong.SoloProj.Models.User;
import com.phong.SoloProj.Services.BookService;
import com.phong.SoloProj.Services.ServiceHandler;

@Controller
public class MainController {

	@Autowired
	private ServiceHandler serviceHandler;
	@Autowired
	private HttpSession inSession;
	@Autowired
	private BookService bookService;
	private String IMAGE_FOLDER = "src/main/resources/static/img/UploadTo/";

	// Root route user to registration/login return index page
	@GetMapping("/")
	public String index(@ModelAttribute("newlyCreatedUser") User user,
			@ModelAttribute("newActiveUser") ActiveUser activeUser) {
		return "index.jsp";
	}

	@PostMapping("/registerUser")
	public String registerUser(@Valid @ModelAttribute("newlyCreatedUser") User user, BindingResult result,
			HttpSession inSession, @ModelAttribute("newActiveUser") ActiveUser activeUser) {
		// validate user
		serviceHandler.validate(user, result);
		if (result.hasErrors()) {
			return "index.jsp";

		}
		// Register user into Web app
		serviceHandler.registeredUserPw(user);
		// Put user in session
		inSession.setAttribute("loggedInUser", user);
		return "redirect:/books";
	}

	// Logging User Into Web app

	@PostMapping("/login")
	public String loginUser(@Valid @ModelAttribute("newActiveUser") ActiveUser activeUser, BindingResult results,
			@ModelAttribute("newlyCreatedUser") User user) {
		serviceHandler.authUser(activeUser, results);
		if (results.hasFieldErrors()) {
			return "index.jsp";
		}
		User loggedInUser = serviceHandler.findByEmail(activeUser.getEmail());

		inSession.setAttribute("loggedInUser", loggedInUser);
		return "redirect:/books";

	}

	// logging user out
	@GetMapping("/logout")
	public String logout() {
		inSession.invalidate();
		return "redirect:/";
	}

	// *Use if (inSession.getAttribute("loggedInUser") != null)**

	// Get to landing page after you login

	@GetMapping("books")
	public String books(Model model, HttpSession inSession) {

		if (inSession.getAttribute("loggedInUser") != null) {
			User user = (User) inSession.getAttribute("loggedInUser");
			User currentLoggedIn = serviceHandler.findByID(user.getId());
			model.addAttribute("books", bookService.allBooks());
			model.addAttribute("currentLoggedIn", currentLoggedIn);
			return "books.jsp";
		} else {

			return "redirect:/";

		}
	}

	@GetMapping("/newBook")
	public String newBook(@ModelAttribute("newBook") Book book) {
		if (inSession.getAttribute("loggedInUser") != null) {
			return "newbook.jsp";
		} else {
			return "redirect:/";
		}
	}

	@PostMapping("/books/new")
	public String newBook(@Valid @ModelAttribute("newBook") Book book, BindingResult result,
			@RequestParam("coverimage") MultipartFile file) {
		if (result.hasErrors()) {
			return "newbook.jsp";
		} else {
			
			try {
				FileOutputStream output = new FileOutputStream(IMAGE_FOLDER + file.getOriginalFilename());
				output.write(file.getBytes());
				book.setImgurl("/img/UploadTo/"+ file.getOriginalFilename());
				output.close(); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		bookService.createBook(book);
		return "redirect:/books";
	}
	} 

	// *change
	@GetMapping("/books/{id}")
	public String bookDetails(@PathVariable Long id, Model bookModel, Model userRating, HttpSession inSession,
			User user) {
		if (inSession.getAttribute("loggedInUser") != null) {

			Book userBook = bookService.getOneBook(id);

			bookModel.addAttribute("book", userBook);

			return "bookdetails.jsp";

		} else {
			return "redirect:/";
		}
	}

	@GetMapping("/books/{id}/edit")
	public String edit(@ModelAttribute("editBook") Book book, @PathVariable Long id, Model model, HttpSession inSession) {
		if (inSession.getAttribute("loggedInUser") != null) {
			Book editBook = bookService.getOneBook(id);

			model.addAttribute("editBook", editBook);
			return "editbook.jsp";
		} else {
			return "redirect:/";
		}
	}

	@PutMapping("/update/{id}")
	public String updateBook(@Valid @ModelAttribute("editBook") Book book, BindingResult result, Model model, @RequestParam("coverimage") MultipartFile file) {
		if (result.hasErrors()) {
			return "editbook.jsp";
		} else {
			
			
			try {
				FileOutputStream output = new FileOutputStream(IMAGE_FOLDER + file.getOriginalFilename());
				output.write(file.getBytes());
				book.setImgurl("/img/UploadTo/"+ file.getOriginalFilename());
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				   
			}
			
			bookService.updateBook(book);

			return "redirect:/books";
		}
	}

	@GetMapping("/delete/{id}")

	public String delete(@PathVariable Long id) {
		if (inSession.getAttribute("loggedInUser") != null) {
			bookService.delete(id);
			return "redirect:/books";
		} else {
			return "redirect:/";
		}
	}

}