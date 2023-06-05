package at.fh.technikum.slmproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {
    private String message = "Everything works as expected";

    @GetMapping("/api/message")
    public String getMessage() {
        return message;
    }

    @GetMapping("/api/message/set")
    @ResponseBody
    public String setMessage(@RequestParam(name = "m") String newMessage) {
        message = newMessage;
        return "ok";
    }
}
