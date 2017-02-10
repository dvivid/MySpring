package com.mk.dy.test;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.exception.MemcachedException;
import net.rubyeye.xmemcached.utils.AddrUtil;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

/**

 * @author dvivid
 * @version V1.0
 * @Title MemcacheTest
 * @Package com.mk.dy.test
 * <p>
 * *****************************************
 * @Description
 * @date 2017/1/12
 */
public class MemcacheTest {


    public static void main(String[] args) {
        memcachedJavaClientTest();
        //xmemcachedClientTest();
    }

    public static void xmemcachedClientTest(){
        //多个地址用空格分开
        MemcachedClientBuilder builder = new XMemcachedClientBuilder(AddrUtil.getAddresses("localhost:11211"));
        builder.setConnectionPoolSize(10);
        builder.setConnectTimeout(3000);
        builder.setFailureMode(true);
        MemcachedClient client = null;
        try {
            client = builder.build();
            client.set("test002",0,"B");
            System.out.println("get value from mc : "+client.get("test002"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (MemcachedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }


    static class CustomBean implements Serializable{
        private String name;
        private String id;
        private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }

    public static void memcachedJavaClientTest(){
        String[] servers = {"localhost:11211"};
        SockIOPool pool = SockIOPool.getInstance();
        pool.setServers(servers);
        pool.setFailover(true);
        pool.setInitConn(5);
        pool.setMinConn(3);
        pool.setMaxConn(10);
        pool.setSocketTO(3000);
        pool.initialize();
        MemCachedClient client = new MemCachedClient();
        client.set("test001","A");
        System.out.println("get value from mc : "+client.get("test001"));

        CustomBean cb = new CustomBean();
        cb.setName("a");
        cb.setId("12aba");
        cb.setAge("1");

        List<CustomBean> list = new ArrayList<CustomBean>();
        list.add(cb);

        client.set("cb_list",list);
        List<CustomBean> cbList = (ArrayList<CustomBean>)client.get("cb_list");
        System.out.println(cbList.get(0).getName());

    }

}
