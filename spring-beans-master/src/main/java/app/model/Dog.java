package app.model;

import org.springframework.stereotype.Component;

/**
 * @author Serov Maxim
 */
@Component
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
