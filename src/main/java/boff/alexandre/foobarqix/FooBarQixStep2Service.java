package boff.alexandre.foobarqix;

import org.springframework.stereotype.Component;

@Component
public class FooBarQixStep2Service implements FooBarQixFactory {
    public FooBarQixStep2Service() {
    }

    @Override
    public String createFooBarQixEntity(Integer entry) {
        boolean fooBarQixAnything = false;
        StringBuilder res = new StringBuilder();
        if(entry % 3 == 0) {
            res.append("Foo");
            fooBarQixAnything = true;
        }
        if(entry % 5 == 0) {
            res.append("Bar");
            fooBarQixAnything = true;
        }
        if(entry % 7 == 0) {
            res.append("Qix");
            fooBarQixAnything = true;
        }
        for(char c : entry.toString().toCharArray()) {
            switch(c) {
                case '3':
                    res.append("Foo");
                    break;
                case '5':
                    res.append("Bar");
                    break;
                case '7':
                    res.append("Qix");
                    break;
                case '0':
                    res.append("*");
                    break;
                default:
                    if(!fooBarQixAnything) {
                        res.append(c);
                    }
            }
        }
        return res.toString();
    }
}
