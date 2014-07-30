package com.jgoodnight.komodi.platform.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Authentication {
	private String token = "1234";

	@JsonProperty
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
