package com.concretepage.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("animal_dev")
public class Elephant implements Animal {
	
	@Value("${api.pricing.thresold}")
	private int count;
	
	@Override
	public String getMessage() {
		return "Hello Elephant! " + count;
	}
}
