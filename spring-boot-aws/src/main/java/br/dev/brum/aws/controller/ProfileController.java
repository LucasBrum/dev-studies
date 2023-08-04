package br.dev.brum.aws.controller;

import br.dev.brum.aws.data.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProfileController {

	@GetMapping(value = "users", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsers() {
		return List.of(
				new User("Lucas", "Brum", "lucas.brum@brum.com"),
				new User("Ester", "Brum", "ester.brum@brum.com")
		);
	}

}
