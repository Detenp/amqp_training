package fr.lernejo.chat;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Launcher.class);
        RabbitTemplate rt = context.getBean(RabbitTemplate.class);
        Scanner in = new Scanner(System.in);
        String line;

        do {
            line = in.next();
            rt.convertAndSend("chat_messages", line);
            System.out.println("Message sent my dude");
        } while (!line.equals("q"));

        context.close();
    }
}
