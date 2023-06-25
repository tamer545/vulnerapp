package ch.bbw.m183.vulnerapp.service;

import ch.bbw.m183.vulnerapp.datamodel.UserEntity;
import ch.bbw.m183.vulnerapp.repository.UserRepository;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

public class UserDetailsService {
    UserRepository userRepository;
    @Bean
    public void userDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    Optional<UserEntity> findByID(String userId){
        return userRepository.findById(userId);
    }

}
