package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> getAllUsers();

    void save(User user);

    void update(User user);

    User findById(Long id);

    void deleteById(Long id);

    User findByUsername(String username);

    Set<Role> getAllRoles(); // нужен для формы редактирования
}