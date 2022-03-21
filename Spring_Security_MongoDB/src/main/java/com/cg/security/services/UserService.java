package com.cg.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cg.security.model.UserModel;
import com.cg.security.model.UserRepository;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	  UserModel findByUsername = userRepository.findByUsername(username);

	  if(foundedUser == null) return null;
	  
	  String name = foundedUser.getUsername();
	  String pwd = foundedUser.getPassword();
	  
	  return new User(name,pwd,null);
	}
	

}
