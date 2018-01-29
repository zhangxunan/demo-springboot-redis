package com.example.demospringbootredis.utils;

import com.example.demospringbootredis.DemoSpringbootRedisApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoSpringbootRedisApplication.class)
public class JedisClusterUtilsTest {

    @Before
    public void setUp() throws Exception {

//        SpringApplication.setAdditionalProfiles("");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void init() {
    }

    @Test
    public void saveString() {
        JedisClusterUtils.saveString("hello", "你好");
        System.out.println("jedisClusterUtils = " + 1);
    }

    @Test
    public void saveToSet() {
    }

    @Test
    public void getFromSet() {
    }

    @Test
    public void saveNX() {
    }

    @Test
    public void saveNX1() {
    }

    @Test
    public void saveString1() {
    }

    @Test
    public void saveSeq() {
    }

    @Test
    public void saveFloat() {
    }

    @Test
    public void saveBean() {
    }

    @Test
    public void saveBean1() {
    }

    @Test
    public void saveToQueue() {
    }

    @Test
    public void hashSet() {
    }

    @Test
    public void hgetAll() {
    }

    @Test
    public void hashSet1() {
    }

    @Test
    public void getBean() {
    }

    @Test
    public void getString() {
    }

    @Test
    public void getFromQueue() {
    }

    @Test
    public void popQueue() {
    }

    @Test
    public void getSeqNext() {
    }

    @Test
    public void getSeqNext1() {
    }

    @Test
    public void getSeqBack() {
    }

    @Test
    public void hashGet() {
    }

    @Test
    public void hashGet1() {
    }

    @Test
    public void incrFloat() {
    }

    @Test
    public void isCached() {
    }

    @Test
    public void hashCached() {
    }

    @Test
    public void isMember() {
    }

    @Test
    public void delKey() {
    }

    @Test
    public void expire() {
    }

    @Test
    public void listSet() {
    }

    @Test
    public void setSave() {
    }

    @Test
    public void listSortedsetRev() {
    }

    @Test
    public void getRankRev() {
    }

    @Test
    public void getMemberScore() {
    }

    @Test
    public void saveToSortedset() {
    }

    @Test
    public void delFromSortedset() {
    }

    @Test
    public void getBeanFromMap() {
    }

    @Test
    public void delFromMap() {
    }

    @Test
    public void incr() {
    }

    @Test
    public void getCount() {
    }

    @Test
    public void lpush() {
    }

    @Test
    public void lpushx() {
    }

    @Test
    public void llen() {
    }

    @Test
    public void lrange() {
    }

    @Test
    public void lpop() {
    }

    @Test
    public void hsetnx() {
    }

    @Test
    public void hsetnx1() {
    }
}