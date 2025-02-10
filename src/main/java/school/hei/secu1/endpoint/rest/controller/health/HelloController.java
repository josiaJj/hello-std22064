package school.hei.secu1.endpoint.rest.controller.health;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloController {

  @GetMapping("/Hello")
  public String hello() {
    return "World !";
  }
}
