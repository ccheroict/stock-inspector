package cc.si.model;

public class User {

	public String login;
	public String apiKey;

	public User(String login, String password) {
		this.login = login;
		this.apiKey = password;
	}
}
