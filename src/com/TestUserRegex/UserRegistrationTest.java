package com.TestUserRegex;

import com.UserRegistrationRegex.UserRegistration;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	
	UserRegistration test= new UserRegistration();

	@Test
	public void returnTrueIfFirstNameStartsWithCapitalAndHasMinThreeCharacters() {
		assertTrue(test.validateFirstName("Nirmal"));
	}
	
	@Test
	public void ReturnTrueIfLastNameStartsWithCapitalAndHasMinThreeCharacters() {
		
		assertTrue(test.validateLastName("Yadav"));
	}
	
	@Test
	public void shouldReturnTrueIfEmailIsValid() {
		assertTrue(test.validateEmail("yadavnirmal007@gmail.com"));
	}
	
	@Test
	public void shouldReturnTrueIfMobileNumberIsValid() {
		assertTrue(test.validateMobileNumber("91 8898255756"));
	}
	
	@Test
	public void shouldReturnTrueIfPasswordIsValid() {
		assertTrue(test.validatePassword("ny999"));
	}
}
