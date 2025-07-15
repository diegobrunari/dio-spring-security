package dio.spring.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to my Spring Boot Security Application";
    }
    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('managers','users')")
    public String users(){
        return "Authorized user";
    }

    @GetMapping("/managers")
    @PreAuthorize("hasRole('managers')")
    public String manager(){
        return "Authorized manager";
    }
}
