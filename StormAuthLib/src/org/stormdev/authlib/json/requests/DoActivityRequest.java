package org.stormdev.authlib.json.requests;

public class DoActivityRequest {
	public static String request = "doActivity";
	private String email;
	private String sessionID;
	
	public DoActivityRequest(String email, String sessionID){
		this.email = email;
		this.sessionID = sessionID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSessionID() {
		return sessionID;
	}
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	
	
}
