package org.stormdev.authlib.json.response;

/**
 * The response from the server for clientDualAuth.
 *
 */
public class ClientAuthResponse {
	private boolean success = false;
	private String error = null;
	private String authKey = null;
	
	/**
	 * If the request was a success, aka you were sent an AuthKey, etc...
	 * @return If it was successful
	 */
	public boolean wasSuccessful(){
		return this.success;
	}
	
	/**
	 * If there was an error, eg. The session was invalid (Not logged in/wrong SessionID)
	 * @return If there was an error
	 */
	public boolean wasError(){
		return this.error != null;
	}
	
	/**
	 * What went wrong (Eg. invalid session - Not logged in/wrong SessionID)
	 * @return The Error
	 */
	public ClientAuthError getError(){
		return ClientAuthError.valueOf(error.toUpperCase());
	}
	
	/**
	 * The AuthKey generated by StormDev for use with serverDualAuth
	 * @return The AuthKey as a string
	 */
	public String getAuthKey(){
		return this.authKey;
	}
}
