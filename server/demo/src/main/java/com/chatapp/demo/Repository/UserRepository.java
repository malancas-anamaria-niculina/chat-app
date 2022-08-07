package com.chatapp.demo.Repository;

import org.springframework.stereotype.Repository;
import com.chatapp.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
}

