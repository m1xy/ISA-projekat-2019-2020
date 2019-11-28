package com.isa.backend.model.user;

public class UserTokenState {

	private String accessToken;
	private Long expiresIn;
	private Long id;
	private Authority authority;

	public UserTokenState() {
		this.accessToken = null;
		this.expiresIn = null;
		this.id = null;
		this.authority = null;
	}

	public UserTokenState(String accessToken, long expiresIn, Long id, Authority authority) {
		this.accessToken = accessToken;
		this.expiresIn = expiresIn;
		this.id = id;
		this.authority = authority;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Authority getAuthority() {
		return authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}
}
