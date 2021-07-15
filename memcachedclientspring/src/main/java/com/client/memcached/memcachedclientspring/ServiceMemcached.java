package com.client.memcached.memcachedclientspring;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ServiceMemcached {

	@Autowired
	MemcachedRepository memcachedRepository;


	public void fun() {
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
//		mcc.add("1", "32");
//		System.out.println("get  " + mcc.get("1"));
		Key key = new Key();
  key.setId(1);
  key.setK(1);
  memcachedRepository.save(key);
  Key key1 = memcachedRepository.getOne(1);
		System.out.println("my data in h2 is "+ key1);
//		Producer p = new Producer();
//		p.setting();
//		p.add("55");
	}

	@PostConstruct
	public void postConstruct()
	{
		fun();
	}
}