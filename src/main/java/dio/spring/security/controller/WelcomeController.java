package dio.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to my Spring Boot Security Application";
    }
    @GetMapping("/users")
    public String users(){
        return "Authorized user";
    }

    @GetMapping("/managers")
    public String manager(){
        return "Authorized manager";
    }
}
