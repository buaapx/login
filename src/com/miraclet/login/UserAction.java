package com.miraclet.login;


public class UserAction {
	private String username;
	private String password;
	//private String word;
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String execute() throws Exception{
		if(username.equals("sunyang") && password.equals("123456")){
			return "success";
		}
		else{
			return "error";
		}
	}
}
