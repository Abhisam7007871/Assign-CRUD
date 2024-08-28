package com.CRUD_API.Assign.CRUD.service;

import com.CRUD_API.Assign.CRUD.dto.UserDto;
import com.CRUD_API.Assign.CRUD.entity.User;

public interface UserService {
    User findByUsername(String username);

    User save(UserDto userDto);

}
