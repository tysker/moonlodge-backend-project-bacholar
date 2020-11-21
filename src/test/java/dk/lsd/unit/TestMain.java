package dk.lsd.unit;

import dk.lsd.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {

    @Test
    void getStringTest(){
        Assertions.assertEquals("Hello World", new Main().getString());
    }
}
