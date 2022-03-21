package com.cg.security.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	@Autowired
	private UserRepository userRepository;
	
     @PostMapping("/subs")
	private ResponseEntity<?> subscribeClient(@RequestBoby AuthenticationRequest authenticationRequest)
	{	
		String username = authenticationRequest.getUsername();
		String password = authenticationRequest.getPassword();
		UserModel userModel = new UserModel();
		userModel.setUsername(username);
		userModel.setPassword(password);
		try {
			userRepository.save(userModel);
		}catch (Exception e) {
			return ResponseEntity.ok(new AuthenticationResponse("Error during subscription for client"+username));
		}
	
		return ResponseEntity.ok(new AuthenticationResponse("Succesful subscription for client"+username));
	}
    @PostMapping("/auth")
    private ResponseEntity<?> authenticationClient(@RequestBody AuthenticationRequest authenticationRequest)
    {
    	
    }
}
