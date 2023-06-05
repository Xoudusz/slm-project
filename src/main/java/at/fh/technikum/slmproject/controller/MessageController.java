package at.fh.technikum.slmproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private String message = "Everything works as expected";

    @GetMapping("/api/message")
    String getMessage() {
        return message;
    }

}
