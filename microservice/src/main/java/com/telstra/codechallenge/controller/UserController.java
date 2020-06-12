package com.telstra.codechallenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telstra.codechallenge.model.ChallengeUser;
import com.telstra.codechallenge.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(path = "/users", method = RequestMethod.GET)
	public List<ChallengeUser> getUser(@RequestParam(value = "returnAccount", defaultValue = "5") int returnAccount) {
		return userService.getUser(returnAccount);
	}
}
