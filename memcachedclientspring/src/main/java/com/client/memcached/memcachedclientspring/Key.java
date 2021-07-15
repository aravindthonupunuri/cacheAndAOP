package com.client.memcached.memcachedclientspring;

import org.springframework.stereotype.Component;

import javax.persistence.*;


@Entity
@Table(name = "key")
public class Key {
    @Id
    @Column(name = "id")
  public Integer id;

    @Column(name = "k")
    public Integer k;


    public Key() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getK() {
        return k;
    }

    public void setK(Integer k) {
        this.k = k;
    }

    public Key(Integer id, Integer k) {
        this.id = id;
        this.k = k;
    }
}
