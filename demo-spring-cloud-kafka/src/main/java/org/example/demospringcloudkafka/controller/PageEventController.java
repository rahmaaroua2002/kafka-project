package org.example.demospringcloudkafka.conroller;
@Restcontroller
public class PageEventRestController{
    @Autowired
    private StreamBridge streamBridge;
    @getMapping("/publish/{topic}/{name}")
    public PageEvent publish(@PathVariable String topic, String name){
        PageEvent pageEvent=new  PageEvent(name , Math.random()>0.5"U1":"U2",new Date(),new Random().nextInt(9000));
        streambridge.send(topic, pageEvent);
    }

}