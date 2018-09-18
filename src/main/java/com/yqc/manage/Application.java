package com.yqc.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author admin
 * @date 2017/3/1
 */
@SpringBootApplication(scanBasePackages = {"com.yqc.test", "com.yqc.test.config"})
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
