package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @Autowired
    private GreetingRepository greetingRepository;

    @RequestMapping("/")
    String home() {
        return "Hello World....- " + greetingRepository.findAll().stream().map(Greeting::getContent);
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    public Greeting create(@RequestBody Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{greetingId}")
    public Greeting get(@PathVariable String greetingId) {
        return greetingRepository.findById(greetingId).orElse(null);
    }
}
