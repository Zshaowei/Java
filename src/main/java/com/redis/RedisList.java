package com.redis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RedisList {
    public static void main(String[] args) {
        // Java Redis List(列表)实例
        Jedis jedis = new Jedis("localhost");
        // 验证redis是否连接
        System.out.println("Redis 服务运行情况：" + jedis.ping());

        Set<String > keys = jedis.keys("*");
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }

        List<String> list = jedis.lrange("site-list",0,10);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
