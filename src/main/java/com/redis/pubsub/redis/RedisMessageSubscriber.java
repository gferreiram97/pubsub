package com.redis.pubsub.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RedisMessageSubscriber implements MessageListener {

    public RedisMessageSubscriber() {
    }

    @Override
    public void onMessage(final Message message, byte[] pattern) {
        log.info("Message received, message={}, pattern={}", message, pattern);
    }
}
