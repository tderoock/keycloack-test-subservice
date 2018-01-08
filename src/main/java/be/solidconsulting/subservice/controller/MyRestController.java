package be.solidconsulting.subservice.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;

@CrossOrigin(origins = CorsConfiguration.ALL)
@RestController
public class MyRestController {

    @CrossOrigin(origins = CorsConfiguration.ALL)
    @GetMapping(value = "/subservice")
    @PreAuthorize("hasRole('SUBSERVICE')")
    public String  getSecured() {
        return "{ \"message\": \"Entrypoint Secured Met ROLE_SUBSERVICE\"}";
    }
}
