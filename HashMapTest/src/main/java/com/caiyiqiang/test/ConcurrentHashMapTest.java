package com.caiyiqiang.test;


import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: HashMap
 * @description:
 * @author: Mr.Cai
 * @create: 2019-08-22 16:13
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> concurrentHashMap=new ConcurrentHashMap<String,String>();
        concurrentHashMap.put("1","2");
        System.err.println(concurrentHashMap.get("1"));
    }
}
