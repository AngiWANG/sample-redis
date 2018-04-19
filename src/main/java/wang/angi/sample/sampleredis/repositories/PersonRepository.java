package wang.angi.sample.sampleredis.repositories;

import org.springframework.data.repository.CrudRepository;
import wang.angi.sample.sampleredis.domain.Person;

/**
 * @author angi
 */
public interface PersonRepository extends CrudRepository<Person, String> {

}