package com.example.memcache.memcache;

import com.btmatthews.springboot.memcached.EnableMemcached;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMemcached
public class MemcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemcacheApplication.class, args);
	}

}
