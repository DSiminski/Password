package com.Password.controller;

import com.criptoPassword.dto.RegisterRequest;
import com.criptoPassword.entities.User;
import com.criptoPassword.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService usersService;

    @GetMapping("/passwords")
    public List listPasswords(@RequestHeader HttpHeaders headers){
        return this.usersService.getUsers(headers);
    }

    @PostMapping("/new-user")
    public ResponseEntity<?> register(RegisterRequest registerRequest){
        return this.usersService.newUser(registerRequest);
    }

    @GetMapping("/datas")
    public ResponseEntity<User> register(@RequestHeader HttpHeaders headers){
        return this.usersService.getMyDatas(headers);
    }
}
