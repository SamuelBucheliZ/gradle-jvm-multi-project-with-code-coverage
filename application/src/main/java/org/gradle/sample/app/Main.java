package org.gradle.sample.app;

import org.gradle.sample.list.LinkedList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.gradle.sample.app.MessageUtils.getMessage;
import static org.gradle.sample.utilities.StringUtils.join;
import static org.gradle.sample.utilities.StringUtils.split;

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        LinkedList tokens;
        tokens = split(getMessage());
        System.out.println(join(tokens));
    }
}
