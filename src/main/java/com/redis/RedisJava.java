package com.redis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RedisJava {
    public static void main(String[] args) {
        // 链接本地Redis服务
        Jedis jedis = new Jedis("localhost");
        // 如果Redis服务设置了密码，需要下面这行，没有就不行
//        jedis.auth("123456");
        System.out.println("链接成功！");
        // 查看服务器是否运行
        System.out.println("服务正在运行" + jedis.ping());

        // Redis Java String(字符串)实例
        // redis 设置字符串数据
        jedis.set("name","张绍伟");
        // 获取存储的数据并输出
        System.out.println("redis存储的字符串为：" + jedis.get("name"));

        // Redis Java List(列表)实例
        // 存储数据到列表
        jedis.lpush("site-list","Hello");
        jedis.lpush("site-list","World");
        jedis.lpush("site-list","Redis!");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list",0,3);
        for (int i = 0; i < list.size(); i++){
            System.out.println("列表项为:" + list.get(i));
        }

        // Redis Java Keys实例
        Set<String> keys = jedis.keys("*");
        Iterator<String > it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }

    }
}
