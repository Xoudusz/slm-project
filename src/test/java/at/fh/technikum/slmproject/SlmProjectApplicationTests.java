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
        // resetting message to default
        this.controller.resetMessage();
        assertEquals(this.controller.getMessage(), "Everything works as expected");
    }

    @Test
    public void
    setMessageTest(){
        String message = "Service checks: No power until 5:00 pm";
        this.controller.setMessage(message);
        assertEquals(this.controller.getMessage(), message);
    }

    @Test
    public void
    resetMessageTest(){

        String message = "Service checks: No power until 5:00 pm";
        this.controller.setMessage(message);
        assertEquals(this.controller.getMessage(), message);

        this.controller.resetMessage();
        assertEquals(this.controller.getMessage(), "Everything works as expected");
    }
}
