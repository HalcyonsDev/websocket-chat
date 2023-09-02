package com.halcyon.chat.controller;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;

}