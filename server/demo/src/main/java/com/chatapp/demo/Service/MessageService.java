package com.chatapp.demo.Service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLEditorKit.LinkController;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatapp.demo.Repository.MessageRepository;
import com.chatapp.demo.Entity.Message;
import com.chatapp.demo.Model.MessageInput;
import com.chatapp.demo.Mapper.MessageMapper;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;
    private static Logger logger = LogManager.getLogger(LinkController.class);

    public List<Message> getMessages() {
        return messageRepository.findAll();
    }

    public List<Message> getMessagesForUser(String username) {
        List<Message> msg_list = new ArrayList<>();
        for (Message msg : getMessages()) {
            if (msg.getUsername().equals(username)) {
                msg_list.add(msg);
            }
        }
        logger.info(username);
        return msg_list;
    }

    public void createMessage(MessageInput messageInput) {
        Message message = MessageMapper.inputToEntity(messageInput);
        messageRepository.save(message);
    }
}
