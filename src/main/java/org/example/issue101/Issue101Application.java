package org.example.issue101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Issue101Application {

  public static void main(String[] args) {
    SpringApplication.run(Issue101Application.class, args);
  }
  @Bean
  @ConfigurationProperties(prefix = "foo.foo1")
  FooConfig fooConfig(){
    return new FooConfig();
  }
}
