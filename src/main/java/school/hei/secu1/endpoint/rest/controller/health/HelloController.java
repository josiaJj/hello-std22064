package school.hei.secu1.endpoint.rest.controller.health;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.secu1.PojaGenerated;

@PojaGenerated
@RestController
@AllArgsConstructor
public class HelloController {

    public static final ResponseEntity<String> OK = new ResponseEntity<>("OK", HttpStatus.OK);
    public static final ResponseEntity<String> KO =
            new ResponseEntity<>("KO", HttpStatus.INTERNAL_SERVER_ERROR);

    @GetMapping("/Hello")
    public String hello() {
        return "World !";
    }
}
