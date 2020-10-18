package com.thepolo49.apigestion;

import java.util.ArrayList;
import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	    admin.setEmail("admin@email.com");
	    admin.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_ADMIN)));

	    userService.signup(admin);

	    User client = new User();
	    client.setUsername("client");
	    client.setPassword("client");
	    client.setEmail("client@email.com");
	    client.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_CLIENT)));

	    userService.signup(client);
	  }


}
