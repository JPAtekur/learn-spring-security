package com.learn.service;

import com.learn.AppUserRepo;
import com.learn.model.AppUser;
import com.learn.model.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private AppUserRepo appUserRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = this.appUserRepo.findByUsername(username);
        if (appUser == null){
            throw new UsernameNotFoundException("NO USER");
        }
        return new CustomUserDetails(appUser);
    }
}
