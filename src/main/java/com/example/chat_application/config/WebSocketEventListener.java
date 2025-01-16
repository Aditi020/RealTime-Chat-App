package com.example.chat_application.config;

import java.util.Objects;

import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.example.chat_application.service.Message;
import com.example.chat_application.service.MsgType;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequiredArgsConstructor
public class WebSocketEventListener {

    private final SimpMessageSendingOperations messagOperations;
//    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(WebSocketEventListener.class);

    @EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
        String username = (String) Objects.requireNonNull(headerAccessor.getSessionAttributes()).get("username");

        if (Objects.nonNull(username)) {
            log.info("User disconnected: {}", username);

            messagOperations.convertAndSend(
                    "/topic/chat",
                    Message.builder() // builder() should now work
                            .type(MsgType.LEAVE)
                            .sender(username)
                            .build()
            );
        }
    }
}