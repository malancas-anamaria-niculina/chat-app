package com.chatapp.demo.Model;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageInput {
    private String username;
    private String message;
    private String sender;
}
