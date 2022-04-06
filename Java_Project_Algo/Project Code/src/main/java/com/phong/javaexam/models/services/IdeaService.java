package com.phong.javaexam.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phong.javaexam.controllers.models.Idea;
import com.phong.javaexam.controllers.models.User;
import com.phong.javaexam.repositories.IdeaRepository;

@Service
public class IdeaService {
	@Autowired
	private IdeaRepository ideaRepo; 
	
	public List<Idea> allIdeas() {
		return ideaRepo.findAll(); 
	}
	
	public Idea createIdea(Idea idea) {
		return ideaRepo.save(idea);
	}
	
	public void deleteIdea(Long id) {
		ideaRepo.deleteById(id);
	}
	public Idea getOneIdea(Long id) {
		return ideaRepo.findById(id).orElse(null); 
	}
	public Idea updateIdea(Idea idea) {
		return ideaRepo.save(idea); 
	}
	public void likeIdea(Idea idea, User user) {
		List<User> likers=idea.getLikers(); 
		likers.add(user);
		ideaRepo.save(idea); 
	}
	
	public void unLikeIdea(Idea idea, User user) {
		List<User>likers=idea.getLikers(); 
		likers.remove(user);
		ideaRepo.save(idea); 
	}

}
