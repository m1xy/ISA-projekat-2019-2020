package com.isa.backend.security;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class TimeProvider implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3358167190102617449L;

	public Date now() {
		return new Date();
	}
}
