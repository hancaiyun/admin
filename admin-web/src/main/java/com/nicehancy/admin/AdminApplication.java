package com.nicehancy.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 主启动类
 * @author hancaiyun
 */
@Slf4j
@SpringBootApplication
@ServletComponentScan
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
		log.info("Admin服务已启动...");
	}

}
