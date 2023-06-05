package at.fh.technikum.slmproject;

import at.fh.technikum.slmproject.controller.MessageController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SlmProjectApplicationTests {

    @Autowired
    private MessageController controller;
    @Test
    public void
    deliverMessageTest(){
        assertEquals(this.controller.getMessage(), "Everything works as expected");
    }

}
