package com.example.demospringbootredis.controller;

import com.example.demospringbootredis.utils.JedisClusterUtils;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private RedissonClient redissonClient;

    @ResponseBody
    @RequestMapping("/lock")
    public String lock(@RequestParam("sid") String serverId) {
        Long counter = JedisClusterUtils.incr("COUNT");
        RLock lock = redissonClient.getLock("TEST");
        try {
            lock.lock();
            logger.info("Request Thread - " + counter + "[" + serverId + "] locked and begun...");
            Thread.sleep(5000); // 5 sec
            logger.info("Request Thread - " + counter + "[" + serverId + "] ended successfully...");
        } catch (Exception ex) {
            logger.error("Error occurred");
        } finally {
            lock.unlock();
            logger.info("Request Thread - " + counter + "[" + serverId + "] unlocked...");
        }

        return "lock-" + counter + "[" + serverId + "]";
    }
}
