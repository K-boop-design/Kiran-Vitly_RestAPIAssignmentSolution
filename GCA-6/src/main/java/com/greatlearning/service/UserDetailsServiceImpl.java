package com.greatlearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.greatlearning.model.User;
import com.greatlearning.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	   @Autowired
	    private UserRepository userRepository;
	     
	   

		public void save(User user) {
			// TODO Auto-generated method stub
			userRepository.save(user);
		}



		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			// TODO Auto-generated method stub
			return null;
		}

}
