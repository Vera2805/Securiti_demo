package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    @Transactional
    void addUser(User user);

    @Transactional
    void deleteUser(Long id);

    List<User> getAllUsers();

    @Transactional
    void updateUser(User user);

    User getUser(Long id);

    String getPassword(Long id);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
