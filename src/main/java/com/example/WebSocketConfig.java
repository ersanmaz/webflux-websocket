package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.HandlerMapping;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;

import java.util.Map;

@Configuration
public class WebSocketConfig {

    @Bean
    public HandlerMapping handlerMapping(EchoWebSocketHandler echoWebSocketHandler) {
        Map<String, EchoWebSocketHandler> handlerMap = Map.of("/echo/uppercase", echoWebSocketHandler);
        return new SimpleUrlHandlerMapping(handlerMap, 1);
    }
}
