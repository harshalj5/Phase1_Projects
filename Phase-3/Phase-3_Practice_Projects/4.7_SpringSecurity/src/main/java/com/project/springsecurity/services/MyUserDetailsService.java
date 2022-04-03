package com.project.springsecurity.services;

import java.util.Optional;

import org.apache.kafka.common.message.DescribeUserScramCredentialsRequestData.UserName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.springsecurity.entities.MyUserDetails;
import com.project.springsecurity.entities.User;
import com.project.springsecurity.repositories.UserRepository;
import com.project.springsecurity.repositories.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepo;
	
	public User GetUserByName(String name) {
		Optional<User> user = userRepo.findUserByName(name);
		if(!user.isPresent()) throw new RuntimeException();
		return user.get();
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		return (UserDetails) new MyUserDetailsService();
	}

}