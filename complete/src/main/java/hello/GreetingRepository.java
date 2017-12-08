package hello;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepository {
    public String sayHello(){
        return "Hai";
    }
}
