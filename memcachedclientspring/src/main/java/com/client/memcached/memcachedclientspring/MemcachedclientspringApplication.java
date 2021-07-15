package com.client.memcached.memcachedclientspring;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
public class MemcachedclientspringApplication {
//@Autowired
//Key key;
//@Autowired
//MemcachedRepository memcachedRepository;
//	@Autowired
//	@Lazy
//	static ServiceMemcached serviceMemcached;
	public static void main(String[] args) {

		SpringApplication.run(MemcachedclientspringApplication.class, args);
//		serviceMemcached.fun();
//		String[] servers = {"localhost:11211"};
//		SockIOPool pool = SockIOPool.getInstance("b");
//		pool.setServers(servers);
//		pool.setFailover(true);
//		pool.setInitConn(10);
//		pool.setMinConn(5);
//		pool.setMaxConn(250);
//		pool.setMaintSleep(30);
//		pool.setNagle(false);
//		pool.setSocketTO(3000);
//		pool.setAliveCheck(true);
//		pool.initialize();
//		MemCachedClient mcc = new MemCachedClient("b");
//		mcc.add("1","32");
//		System.out.println("get  "+mcc.get("1"));
//
//		Producer p = new Producer();
//		p.setting();
//		p.add("55");
	}
//	@Bean
//public void setting(){
//		key.setK(1);
//		key.setId(1);
//	memcachedRepository.save(key);
//}
}
