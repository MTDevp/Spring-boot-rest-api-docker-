package mtdev.tarek.dockerwithspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerWithSpringApplication {
       @GetMapping("/message")
    public String getMessage() {
        return "Server is up!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerWithSpringApplication.class, args);
    }

}
