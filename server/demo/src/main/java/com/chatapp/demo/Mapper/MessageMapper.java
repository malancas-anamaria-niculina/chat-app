package com.chatapp.demo.Mapper;

import com.chatapp.demo.Model.MessageInput;
import com.chatapp.demo.Entity.Message;

public class MessageMapper {
    public static Message inputToEntity(MessageInput messageInput){
        return Message.builder()
                    .username(messageInput.getUsername())
                    .message(messageInput.getMessage())
                    .sender(messageInput.getSender())
                    .build();
    }
}
