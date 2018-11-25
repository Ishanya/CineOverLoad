package com.ntl.movieapp.login.movies.controller;

import static org.junit.Assert.*;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ntl.movieapp.login.movies.model.CredentialsBean;
import com.ntl.movieapp.login.movies.service.CredentialsService;

@RunWith(MockitoJUnitRunner.class)
public class CredentialsControllerTest {

	CredentialsBean cred=new CredentialsBean();
CredentialsBean credentials=new CredentialsBean("","",0);

@Mock
CredentialsService serve;

	
	@Test
	public void testLogin() {
		when(serve.login(credentials)).thenReturn(credentials);
		CredentialsController creden=new CredentialsController(serve);
		cred=creden.login(credentials);
		assertEquals(credentials,cred);
	}

	@Test
	public void testLogout() {
		fail("Not yet implemented");
	}

	@Test
	public void testForgotPassword() {
		fail("Not yet implemented");
	}

}
