package com.CRUD_API.Assign.CRUD.service;

import com.CRUD_API.Assign.CRUD.dto.UserDto;
import com.CRUD_API.Assign.CRUD.entity.User;
import com.CRUD_API.Assign.CRUD.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    PasswordEncoder passwordEncoder;


    private UserRepository userRepository;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserRepository userRepository){
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getFirstName(), userDto.getLastName(), userDto.getEmail(),userDto.getMobile(),userDto.getUsername(),userDto.getPassword(),
                userDto.getCreatedAt(),userDto.getUpdatedAt());
        return userRepository.save(user);
    }


}
