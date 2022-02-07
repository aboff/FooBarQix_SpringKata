package boff.alexandre.foobarqix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FooBarQixController {

    @Autowired
    private final FooBarQixStep1Service step1Factory;
    @Autowired
    private final FooBarQixStep2Service step2Factory;

    public FooBarQixController(FooBarQixStep1Service step1Factory, FooBarQixStep2Service step2Factory) {
        this.step1Factory = step1Factory;
        this.step2Factory = step2Factory;
    }

    @GetMapping("/step1/{entry}")
    String step1(@PathVariable Integer entry) {
        return step1Factory.createFooBarQixEntity(entry).toString();
    }

    @GetMapping("/step2/{entry}")
    String step2(@PathVariable Integer entry) {
        return step2Factory.createFooBarQixEntity(entry).toString();
    }
}
