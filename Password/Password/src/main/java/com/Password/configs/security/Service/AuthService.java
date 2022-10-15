package com.Password.configs.security.Service;

import com.Password.configs.security.Repository.AuthRepository;
import com.Password.entities.User;
import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements UserDetailsService {

    @Autowired
    private AuthRepository authRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> usuario = this.authRepository.findByLoginOrEmail(username);

        if(usuario.isPresent() && usuario.get().isAccountNonExpired()){
            return usuario.get();
        }else{
            return null;
        }
    }

}
