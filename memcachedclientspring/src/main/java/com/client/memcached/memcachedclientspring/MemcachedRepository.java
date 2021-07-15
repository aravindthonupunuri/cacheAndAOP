package com.client.memcached.memcachedclientspring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import  org.springframework.stereotype.Repository;


@Component

@Repository
public interface MemcachedRepository extends JpaRepository<Key,Integer> {
}
