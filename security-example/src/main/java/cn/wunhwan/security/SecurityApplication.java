package cn.wunhwan.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * todo...
 *
 * @author WunHwan
 * @since todo...
 **/
@SpringBootApplication
@EnableJpaRepositories(basePackages = "cn.wunhwan.security.repository")
public class SecurityApplication {

  public static void main(String[] args) {
    SpringApplication.run(SecurityApplication.class, args);
  }
}
