package org.example.demospringcloudkafka.services;


@Service
public class PageEventService{
    @Bean
    public Consumer<PageEvent> pageEventConsumer(){
        return(input)->{
            System.out.println("*****************");
            System.out.println(input.toString());
            System.out.println("*****************");

        };
    }

}