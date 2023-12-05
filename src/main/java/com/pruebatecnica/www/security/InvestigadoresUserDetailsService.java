package com.pruebatecnica.www.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.pruebatecnica.www.dao.IUserDAO;


@Component
public class InvestigadoresUserDetailsService implements UserDetailsService {

    @Autowired
    private IUserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDAO.findByUserName(username)
                .map(InvestigadoresUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("No user found"));
    }
}
