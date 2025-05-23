package top.likanug.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/info")
    public String info() {
        return "This is user-service";
    }
}
