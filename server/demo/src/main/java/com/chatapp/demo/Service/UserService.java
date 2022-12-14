package com.chatapp.demo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatapp.demo.Repository.UserRepository;
import com.chatapp.demo.Entity.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @Transactional(rollbackOn = Exception.class)
    public void createUser(User user){
        user.setPassword(user.getPassword());
        userRepository.save(user);
    }
}
