package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye from Spring Boot!";
    }
    @GetMapping("/status")
    public String status() {
        return "API is running - Tutorial 1";
    }

    @GetMapping("/admin")
    public String admin(@RequestParam(defaultValue = "Guest") String username,
                        @RequestParam(defaultValue = "Admin") String role) {
        return "<html>" +
                "<body>" +
                "  <h2>Welcome to the Admin portal, " + username + "! Your access level is: " + role + "</h2>" +
                "  <form action='/admin' method='GET'>" +
                "    <label for='username'>Username:</label><br>" +
                "    <input type='text' id='username' name='username' value='" + username + "'><br><br>" +
                "    <label for='role'>Access Level:</label><br>" +
                "    <input type='text' id='role' name='role' value='" + role + "'><br><br>" +
                "    <input type='submit' value='Update Portal'>" +
                "  </form>" +
                "</body>" +
                "</html>";
    }
}
