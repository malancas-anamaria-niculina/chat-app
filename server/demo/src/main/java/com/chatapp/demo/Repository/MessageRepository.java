package com.chatapp.demo.Repository;

import org.springframework.stereotype.Repository;
import com.chatapp.demo.Entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

}
