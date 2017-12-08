package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @Autowired
    GreetingRepository greetingRepository;
    public String greet() {
        return greetingRepository.sayHello();
    }
}
