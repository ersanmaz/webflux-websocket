package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> indexRouter(@Value("classpath:/static/index.html") Resource indexHtml) {
        return RouterFunctions.route(RequestPredicates.GET("/index.html"),
                request -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).bodyValue(indexHtml));
    }
}
