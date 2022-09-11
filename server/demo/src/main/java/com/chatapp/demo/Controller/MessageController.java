package com.chatapp.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chatapp.demo.Service.MessageService;
import com.chatapp.demo.Entity.Message;
import com.chatapp.demo.Model.MessageInput;

@RestController
@RequestMapping(value = "/api/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/messages")
    public List<Message> getAllMessages() {
        return messageService.getMessages();
    }

    @GetMapping(value = "/message")
    public List<Message> getAllMessages(@RequestParam String username) {
        return messageService.getMessagesForUser(username);
    }

    @PostMapping(value = "/createMessage", consumes = { "application/json" })
    public void createMessage(@RequestBody @Validated final MessageInput msg) {
        messageService.createMessage(msg);
    }
}
