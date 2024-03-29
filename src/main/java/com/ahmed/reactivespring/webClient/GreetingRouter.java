package com.ahmed.reactivespring.webClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class GreetingRouter {

//    The router listens for traffic on the /hello path
//    and returns the value provided by our reactive handler class.

    @Bean
    public RouterFunction<ServerResponse> routerFunction(GreetingHandler greetingHandler){
        return RouterFunctions
                .route(RequestPredicates.GET("/hello")
                                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        greetingHandler::hello);
    }


}
