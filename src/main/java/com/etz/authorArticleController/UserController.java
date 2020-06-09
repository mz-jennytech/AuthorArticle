package com.etz.authorArticleController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.etz.authorArticleModel.User;
import com.etz.authorArticleRep.UserRepo;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepo userRepo;
	
	public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

	@GetMapping("/Mostactiveauthor")
	public List<User> getUsernames(User user) {
		return userRepo.findAll();
	}

	@PostMapping("/users/register")
	public ResponseEntity<User> createUser(@Validated @RequestBody User user) throws URISyntaxException {
		User createdUser = userRepo.save(user);
		return ResponseEntity.created(new URI("/api/users/register")).body(createdUser);
	}

//	@PostMapping(value = "/mostactive")
//	public User getUsername (@Validated @RequestBody User user) {
//
//		return userRepo.save(user);
//	}

	@GetMapping("/HighestCommentCount")
	public List<User> getUsernameWithHighestCommandCount(User user) {
		return userRepo.findAll();
	}

	@PostMapping(value = "/HighestCommentCount")
	public User highestCommandCount(@Validated @RequestBody User user) {

		return userRepo.save(user);
	}

	@DeleteMapping("/author/{id}")

	public Map<String, Boolean> deleteauthor(@PathVariable(value = "id") Long Id) throws Exception {

		User rafapplicationmodel = userRepo.findById(Id)

				.orElseThrow(() -> new ResourceAccessException("Worker not found on :: " + Id));

		userRepo.delete(rafapplicationmodel);

		Map<String, Boolean> response = new HashMap<>();

		response.put("deleted", Boolean.TRUE);

		return response;

	}

}
