package org.deepwater.daisy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

// 暂时禁用了自动的安全配置 没搞懂什么情况
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class DaisyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaisyApplication.class, args);
	}
}
