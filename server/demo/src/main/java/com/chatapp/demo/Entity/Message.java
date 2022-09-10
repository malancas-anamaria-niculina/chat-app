package com.chatapp.demo.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collector;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "message_table")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "message", nullable = false)
    private String message;

    @Column(name = "sender", nullable = false)
    private String sender;

    public List<Message> collect(Collector<Object, ?, List<Object>> list) {
        return null;
    }
}
