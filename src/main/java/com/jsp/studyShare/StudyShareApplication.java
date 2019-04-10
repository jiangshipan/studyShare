package com.jsp.studyShare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
public class StudyShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyShareApplication.class, args);
	}

	/**
	 * 配置上传文件大小
	 * @return
	 */
	@Bean
	 public MultipartConfigElement multipartConfigElement() {
		 MultipartConfigFactory factory = new MultipartConfigFactory();
		 //单个数据大小
		 factory.setMaxFileSize("102400KB");
		 factory.setMaxRequestSize("102400KB");
		 return factory.createMultipartConfig();
	 }
}
