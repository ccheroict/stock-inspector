package cc.si.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.si.model.User;

@RestController
public class UserController {

	@RequestMapping(path = "/api/user")
	public User login(String login, String password) {
		return new User(login, password);
	}

}
