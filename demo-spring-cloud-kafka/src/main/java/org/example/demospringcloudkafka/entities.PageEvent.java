package org.example.demospringcloudkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
@Data @NoArgsConstructor @ALLArgsConstructor @ToString
public class PageEvent{
    private String name;
    private String user;
    private Date date;
    private long duration;
}