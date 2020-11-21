package dk.lsd.unit;

import dk.lsd.MessageBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {
    @Test
    public void testNameJoerg() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello Joerg", obj.getMessage("Joerg"));

    }

    @Test
    public void testNameEmpty() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(" "));

    }

    @Test
    public void testNameNull() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(null));

    }
}
