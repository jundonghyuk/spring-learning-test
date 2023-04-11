package nextstep.helloworld.mvc.handler;

import nextstep.helloworld.mvc.domain.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/return-value")
public class ReturnValueController {

    @ResponseBody
    @GetMapping(value = "/message")
    public String string() {
        return "message";
    }

    @ResponseBody
    @GetMapping(value = "/users")
    public User responseBodyForUser() {
        return new User("name", "email");
    }

    @ResponseBody
    @GetMapping(value = "/users/{id}")
    public ResponseEntity<User> responseEntity(@PathVariable Long id) {
//        return new User("name", "email");

//        ResponseEntity responseEntity = new ResponseEntity();
        return ResponseEntity.ok(new User("name", "email"));
    }

    @ResponseBody
    @GetMapping(value = "/members")
    public ResponseEntity<Object> responseEntityFor400() {
        return ResponseEntity.badRequest().build();
    }

    @GetMapping(value = "/thymeleaf")
    public String thymeleaf() {
        return "sample";
    }
}
