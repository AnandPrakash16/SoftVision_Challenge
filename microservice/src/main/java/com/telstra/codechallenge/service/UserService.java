package com.telstra.codechallenge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.telstra.codechallenge.model.ChallengeUser;
import com.telstra.codechallenge.model.Item;
import com.telstra.codechallenge.model.UsersRespone;

@Service
public class UserService {

	public static final String SEARCH_URL = "https://api.github.com/search/users?q=followers:0&sort=joined&order=asc";

	@Autowired
	private Environment env;

	public String getUrl() {
		System.out.println("=========> "+env.getProperty("USER_URL"));
		return env.getProperty("USER_URL");
	}
	
	@Autowired
	RestTemplate restTemplate;

	public List<ChallengeUser> getUser(int returnAccount) {
		List<ChallengeUser> usersList = new ArrayList<ChallengeUser>();
     getUrl();
		UsersRespone responeUser = restTemplate.getForObject(SEARCH_URL, UsersRespone.class);
		if (responeUser.getItems() != null && returnAccount != 0) {
			List<Item> user = responeUser.getItems();

			for (int i = 0; i <= returnAccount; i++) {
				ChallengeUser cUser = new ChallengeUser();
				cUser.setId(user.get(i).getId());
				cUser.setLogin(user.get(i).getLogin());
				cUser.setHtml_url(user.get(i).getHtml_url());
				usersList.add(cUser);
			}
		}
		return usersList;
	}
}
