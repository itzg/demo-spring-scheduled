package me.itzg.demo.springscheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoSpringScheduledApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoSpringScheduledApplication.class, args);
  }
}
