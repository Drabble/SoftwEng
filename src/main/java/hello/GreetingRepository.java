package hello;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface GreetingRepository extends MongoRepository<Greeting, String> {

}