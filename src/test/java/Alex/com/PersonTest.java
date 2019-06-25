package Alex.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void bmiTest() {
        Person person= new Person("Alex",1.7,66.5);
        Assertions.assertEquals(66.5/(1.7*1.7), person.bmi());
    }
}
