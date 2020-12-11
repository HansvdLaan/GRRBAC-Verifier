package com.vanderhighway.grrbac.patterns;

public enum AuthenticationStatus {
	   LOCKED(2),
	   PROTECTED(1),
	   UNLOCKED(0);

	private final int statusCode;
	
	AuthenticationStatus(int statusCode) {
		this.statusCode = statusCode;
	}

	public static String toName(int statusCode) {
		if(statusCode == 0) {
			return "UNLOCKED";
		} else if(statusCode == 1) {
			return "PROTECTED";
		} else if(statusCode == 2) {
			return "LOCKED";
		} else {
			return "UNKOWN";
		}
	}

	public int getStatusCode(){
		return this.statusCode;
	}
}
