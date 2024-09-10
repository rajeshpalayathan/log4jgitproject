package com.ProjectLog4jGit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectLog4jGitApplication {	
	
//	static Logger log = Logger.getLogger(ProjectLog4jGitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProjectLog4jGitApplication.class, args);

//		PropertyConfigurator.configure("projectLog4jGit.properties");
//		log.info("This is INFO");
//		log.warn("This is WARN");
//		log.error("This is ERROR");
//		log.debug("This is DEBUG");
//		log.fatal("This is FATAL");
	}
}
