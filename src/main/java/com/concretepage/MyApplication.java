package com.concretepage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.concretepage.service.Animal;
@SpringBootApplication
public class MyApplication implements CommandLineRunner{
	private static final Logger logger = LoggerFactory.getLogger(MyApplication.class);	
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
		logger.debug("--Application Started--");		
    }  
	
	@Autowired
	Animal animal;

    @Override
    public void run(String...args) throws Exception {
        logger.info("" + animal.getMessage());
    }
}            