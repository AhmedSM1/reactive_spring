package com.ahmed.reactivespring;

import com.ahmed.reactivespring.webClient.GreetingWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveSpringApplication.class, args);

    }



    private  static  void  callWebClient(){
        GreetingWebClient gwc = new GreetingWebClient();
        System.out.println(gwc.getResult());
    }
}
