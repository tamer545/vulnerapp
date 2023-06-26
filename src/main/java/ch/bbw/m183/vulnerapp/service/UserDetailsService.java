package ch.bbw.m183.vulnerapp.service;

import ch.bbw.m183.vulnerapp.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findById(username) .orElseThrow(() -> new UsernameNotFoundException("Username nicht gefunden: " + username));
    }
}
