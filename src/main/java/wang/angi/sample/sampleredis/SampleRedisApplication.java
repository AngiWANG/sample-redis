package wang.angi.sample.sampleredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author angi
 */
@SpringBootApplication
public class SampleRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleRedisApplication.class, args);
    }

    /**
     * LettuceConnectionFactory
     *
     * @return
     */
//    @Bean
//    public RedisConnectionFactory jedisConnectionFactory() {
//        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
//        redisStandaloneConfiguration.setHostName("localhost");
//        redisStandaloneConfiguration.setPort(6379);
//        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(redisStandaloneConfiguration);
//        return jedisConnectionFactory;
//    }

    /**
     * RedisTemplate
     *
     * @return
     */
//    @Bean
//    RedisTemplate<String, String> redisTemplate() {
//        RedisTemplate redisTemplate = new RedisTemplate();
//        redisTemplate.setConnectionFactory(jedisConnectionFactory());
//        return redisTemplate;
//    }

    /**
     * StringRedisTemplate
     *
     * @return
     */
//    @Bean
//    StringRedisTemplate stringRedisTemplate() {
//        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
//        stringRedisTemplate.setConnectionFactory(jedisConnectionFactory());
//        return stringRedisTemplate;
//    }
}
