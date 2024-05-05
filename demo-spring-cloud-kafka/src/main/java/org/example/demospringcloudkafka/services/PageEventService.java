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
    @Bean
    public Supplier<PageEvent> pageEventSupplier(){
        return ()->PageEvent(Math.random()>0.5? "U1":"U2", Math.random()>0.5"U1":"U2",new Date(),new Random().nextInt(9000));


    }

    @Bean
    public Function<PageEvent , PageEvent> pageEventFunction(){
        return(input)->{
            //input.setName("Page Event");
            input.setName("L:"+ input.getName().length());
            input.setUser("UUUUU");
            return input;
        }
    }

}