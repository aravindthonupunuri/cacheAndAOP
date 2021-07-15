package com.client.memcached.memcachedclientspring;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Producer {
    @Autowired
    MemcachedRepository memcachedRepository;
    @Autowired
    Key key;
    // MemCachedClient memCachedClient = new MemCachedClient();
    static int k = 0;
    public void setting(){
        key.setK(1);
        key.setId(1);
        memcachedRepository.save(key);}
    public int keygenerate() {
      // int x = Integer.valueOf( memcachedRepository.getOne(1));
      Key k =  memcachedRepository.getOne(1);
        System.out.println(k);
        int s=0;
//        try {
//
//            System.out.println("hello");
//              Class.forName("org.postgresql.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/memcached","aravind"," ");
//            PreparedStatement preparedStatement = connection.prepareStatement("select k from key");
//            ResultSet resultSet = preparedStatement.executeQuery();
//            //  int k = Integer.valueOf(resultSet.getInt(1));
////            int k = Convert.
////            System.out.println("num "+k);
//
//            while(resultSet.next()){
//                s = resultSet.getInt("k");
//                System.out.println("njum "+s);
//                System.out.println(resultSet.getInt(1));
//            }
//            String q = "delete from key where k = ? ";
//            PreparedStatement ps = connection.prepareStatement(q);
//            ps.setInt(1,s);
//            ps.execute();
//            s++;
//            String query = "insert into key(k)"+"values(?)";
//            PreparedStatement preparedStatement1 = connection.prepareStatement(query);
//            preparedStatement1.setInt(1,s);
//            preparedStatement1.execute();
//            System.out.println("fina; "+s);
//
//
//
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    //    k++;
//        return s;
        return s;
    }

    public Producer() {
        String[] servers = {"localhost:11211"};
        SockIOPool pool = SockIOPool.getInstance("b");
        pool.setServers(servers);
        pool.setFailover(true);
        pool.setInitConn(10);
        pool.setMinConn(5);
        pool.setMaxConn(250);
        pool.setMaintSleep(30);
        pool.setNagle(false);
        pool.setSocketTO(3000);
        pool.setAliveCheck(true);
        pool.initialize();

    }

    public void add(String value) {
        MemCachedClient mcc = new MemCachedClient("b");

        int x = keygenerate();
        String key = String.valueOf(x);

        mcc.add(key, value);
        String str = (String) mcc.get(key);
        System.out.println("value n key "+str);


    }



    public void display() {
        System.out.println("aravind");
    }
}
