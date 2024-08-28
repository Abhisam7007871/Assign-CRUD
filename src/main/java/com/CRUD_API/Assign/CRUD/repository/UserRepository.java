package com.CRUD_API.Assign.CRUD.repository;


import com.CRUD_API.Assign.CRUD.dto.UserDto;
import com.CRUD_API.Assign.CRUD.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User save(UserDto userDto);
}