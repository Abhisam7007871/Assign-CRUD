package com.CRUD_API.Assign.CRUD.config;

import com.CRUD_API.Assign.CRUD.entity.User;
import com.CRUD_API.Assign.CRUD.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public abstract class CustomUserDetailsService implements UserDetails {

    private UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository){
        super();
        this.userRepository = userRepository;
    }


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("Username or password incorrect/not found.");

        }
        return new CustomUserDetails(user.getFirstName(),user.getLastName(),user.getMobile(),user.getEmail(),user.getUsername(),user.getPassword(),getAuthorities());

    }

    public Collection<? extends GrantedAuthority> authorities(){
        return Arrays.asList(new SimpleGrantedAuthority("USER"));
    }
}
