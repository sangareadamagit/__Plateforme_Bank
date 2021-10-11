package net.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.model.User;
import net.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
