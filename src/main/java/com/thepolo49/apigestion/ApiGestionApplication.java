package com.thepolo49.apigestion;

import java.util.ArrayList;
import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.thepolo49.apigestion.model.Role;
import com.thepolo49.apigestion.model.User;
import com.thepolo49.apigestion.service.UserService;

@SpringBootApplication
public class ApiGestionApplication implements CommandLineRunner {

	  @Autowired
	  UserService userService;

	  public static void main(String[] args) {
	    SpringApplication.run(ApiGestionApplication.class, args);
	  }

	  @Bean
	  public ModelMapper modelMapper() {
	    return new ModelMapper();
	  }

	  @Override
	  public void run(String... params) throws Exception {
	    User admin = new User();
	    admin.setUsername("admin");
	    admin.setPassword("admin");
	    admin.setEmail("friders49@hotmail.fr");
	    admin.setRoles(new ArrayList<>(Arrays.asList(Role.ROLE_ADMIN)));

	    userService.signup(admin);

	    User client = new User();
	    client.setUsername("client");
	    client.setPassword("client");
	    client.setEmail("client@email.com");
	    client.setRoles(new ArrayList<>(Arrays.asList(Role.ROLE_CLIENT)));

	    userService.signup(client);
	  }


}
