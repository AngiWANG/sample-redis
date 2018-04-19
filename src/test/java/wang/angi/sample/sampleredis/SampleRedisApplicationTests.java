package wang.angi.sample.sampleredis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;
import wang.angi.sample.sampleredis.domain.Person;
import wang.angi.sample.sampleredis.repositories.PersonRepository;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleRedisApplicationTests {

    // inject the actual template
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    // inject the template as valueOperations
    @Resource(name = "redisTemplate")
    private ValueOperations<String, String> valueOps;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testRedisTemplate() {
        redisTemplate.opsForValue().set("key1", "value1");
        Assert.assertEquals("value1", redisTemplate.opsForValue().get("key1"));
    }

    @Test
    public void testValueOperations() {
        valueOps.set("key2", "value2");
        Assert.assertEquals("value2", valueOps.get("key2"));
    }

    @Test
    public void testStringRedisTemplate() {
        stringRedisTemplate.opsForValue().set("key1", "value1");
        Assert.assertEquals("value1", stringRedisTemplate.opsForValue().get("key1"));
    }

    @Test
    public void testPersonRepository() {
        Person person = new Person();
        person.setFirstname("Ray");
        person.setLastname("WANG");
        person.setAddress("Shanghai");
        personRepository.save(person);
        Assert.assertEquals("Shanghai", personRepository.findById(person.getId()).get().getAddress());
    }
}
